function listPersons() {
  fetch("http://localhost:8081/person/list")
    .then((response) => response.json())
    .then((data) => {
      const content = document.getElementById("content");
      content.innerHTML = "";
      const table = document.createElement("table");
      table.className = "table"; 

    
      const thead = document.createElement("thead");
      const headerRow = document.createElement("tr");
      ["Nombre", "Genero","Email" ,"Fecha De nacimiento", "Ubicación", "Imagen"].forEach((text) => {
        const th = document.createElement("th");
        th.textContent = text;
        headerRow.appendChild(th);
      });
      thead.appendChild(headerRow);
      table.appendChild(thead);
      const tbody = document.createElement("tbody");
      data.forEach((person) => {
        const row = document.createElement("tr");

        const nameCell = document.createElement("td");
        nameCell.textContent = person.name;
        row.appendChild(nameCell);

        const genderCell = document.createElement("td");
        genderCell.textContent = person.gender;
        row.appendChild(genderCell);

        const emailCell = document.createElement("td");
        emailCell.textContent = person.email;
        row.appendChild(emailCell);

        const dateCell = document.createElement('td');
        const birthDate = new Date(person.age);
        const formattedDate = `${birthDate.getDate()}-${birthDate.getMonth()+1}-${birthDate.getFullYear()}`;
        dateCell.textContent = formattedDate;
        row.appendChild(dateCell);

        const locationCell = document.createElement("td");
        locationCell.textContent = person.location;
        row.appendChild(locationCell);

        const pictureCell = document.createElement("td");
        const picture = document.createElement("img");
        picture.src = person.picture;
        pictureCell.appendChild(picture);
        row.appendChild(pictureCell);

        tbody.appendChild(row);
      });
      table.appendChild(tbody);

      content.appendChild(table);
    })
    .catch((error) => {
      console.error("Error:", error);
    });
}
listPersons();
