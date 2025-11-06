const express = require('express')
const app = express()
const port = 3000
const domande = require("./dataset")

app.listen(port, () => {
    console.log(`Server alla porta ${port}`)
});
app.get('/api/questions', (req, res) => {
    res.json(domande)
});