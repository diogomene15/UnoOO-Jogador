module.exports = {
    base:"/UnoOO-Jogador/",
    lang:"pt-BR",
    title:"Jogador Docs",
    appearance:"dark",
    themeConfig:{
        nav:[
            {text:"Início", link:"/"},
            {text:"Classes",
                items:[
                    {text:"Jogador", link:"/jogador/"},
                    {text:"Mão Cartas", link:"/mao-cartas/"},
                    {text:"Jogada", link:"/jogada/"}    
                ]
            },
            


        ],

        socialLinks: [
            { icon: 'github', link: 'https://github.com/diogomene15/UnoOO-Jogador/' }
        ],

        sidebar:[
            {
                text:"Classes",
                items:[
                    {text:"Jogador", link:"/jogador/"},
                    {text:"Mão Cartas", link:"/mao-cartas/"},
                    {text:"Jogada", link:"/jogada/"}   
                ]
            }
        ],
        
        docFooter: {
            prev: 'Página anterior',
            next: 'Próxima página'
        }
    }
}