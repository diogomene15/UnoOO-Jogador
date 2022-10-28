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
                text:"Classes", collapsible: true,
                items:[
                    {
                        text:"Jogador",
                        link:"/jogador/",
                        items:[
                            {text:"Construtores", link:"/jogador/docs/"},
                            {text:"Getters", link:"/jogador/docs/getters"},
                            {text:"Setters", link:"/jogador/docs/setters"},
                            {text:"Compra e descarte", link:"/jogador/docs/compra-e-descarte"},
                            {text:"Realizar jogada", link:"/jogador/docs/realizar-jogada"}
                        ]
                    },
                    {text:"Mão Cartas", link:"/mao-cartas/"},
                    {text:"Jogada", link:"/jogada/"}   
                ]
            }
        ],
        
        docFooter: {
            prev: 'Página anterior',
            next: 'Próxima página'
        },
        outlineTitle: 'Nesta página',
        outline:[2,6]
    }
}