import React ,{Component} from "react"

// Given a stateless functional component, add state to it
// state should have a property called `isLoggedIn` which is a boolean
// (true if logged in, false if not)
// Then, give your best shot at rendering the word "in" if the user is logged in
// or "out" if the user is logged out.

class App extends Component {
  constructor(){
    super()
    this.state = {
      isLoggedIn : false
    }
  }
  render(){
    let login
    if(this.state.isLoggedIn){
      login = "in"
    }else{
      login = "out"
    }
    return (
      <div>
          <h1>You are currently logged {login}</h1>
      </div>
    )
  }
}

export default App