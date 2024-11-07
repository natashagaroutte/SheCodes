<html lang="en"><head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Red Pandas</title>
    <style>
       h1 {
        text-align: center;
        color: white;
        padding: 15px;
        border-radius: 10px;
        background: radial-gradient(780px at 37.8% 100.3%, rgb(19, 55, 115) 2.2%, rgb(32, 7, 80) 20.2%, rgb(27, 88, 111) 58.6%, rgb(115, 88, 44) 75%, rgb(99, 19, 90) 89.6%, rgb(12, 51, 76) 96.1%);

       }
       h2 {
        text-align: center;
        
       }
       p {
        text-align: center;
       }
       button {
         display: block;
         margin: 20px auto;
         background: #a35c1c;
         color: white;
         transition: all 200ms ease;
         font-size: 18px;
         border-radius: 10px;
         border: none;
         padding: 15px 20px;
         box-shadow: 5px 5px 5px rgba(0,0,0,0.3);
       }
       button:hover {
        opacity: 0.9;
        cursor: pointer;
       }
       img {
        display: block;
        margin: 0 auto;
        max-width: 100%;
        padding: 20px;
        border-radius: 30px;
       }
       p {
        line-height: 1.5;
        font-size: 13px;
       }
       .learn-more {
        display: block;
        margin-top: 10px;
        text-decoration: underline;
        color: #a35c1c;
        font-size: 11px;

       }
       .footer {
        text-align: center;
        font-size: 10px;
       }
       .container {
        max-width: 600px;
        margin: 0 auto;
        padding: 30px 60px;
       }
    
    </style>

</head>
<body>
    <div class="container">

   
    <h1>
        Red Pandas are adorable!
    </h1>

    <h2>
        Who doesn't agree?!
    </h2>

    <img src="https://s3.amazonaws.com/shecodesio-production/uploads/files/000/114/151/original/redpanda.jpg?1707259799" alt="Red panda sticking its tounge out">

    <p>
    The red panda is slightly larger than a domestic cat with a bear-like body and thick russet fur. The belly and limbs are
    black, and there are white markings on the side of the head and above its small eyes. Red pandas are very skillful and
    acrobatic animals that predominantly stay in trees. Almost 50% of the red panda’s habitat is in the Eastern Himalayas.
    They use their long, bushy tails for balance and to cover themselves in winter, presumably for warmth. Primarily an
    herbivore, the name panda is said to come from the Nepali word ‘ponya,’ which means bamboo or plant eating animal.
<br>
<br>
    <a href="https://www.worldwildlife.org/species/red-panda" target="_blank" class="learn-more">
    Learn more on WorldWildLife
    </a>
</p>
<p class="footer">
 <button class="picture-button">
        More cute pictures here!
    </button>

    
    This page was built by Natasha Garoutte
</p> 
</div>

<script>
  function picture() {
    let name = prompt("What is your name?");
    let email = prompt("What is your email address?");

    alert("Thank you " + 
    name +
    "! We'll be in touch by email, meanwhile learn more about red pandas!"
     );
  }
  let pictureButton = document.querySelector(".picture-button");
  pictureButton.addEventListener("click", picture);
</script>
</body></html>
