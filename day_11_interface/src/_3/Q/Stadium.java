package _3.Q;

public enum Stadium {
	EDEN_GARDENS_STADIUM{
		@Override
		public String toString() {
			return "This is the home ground of KKR";
		}
	},

	WANKHEDE_STADIUM{
		@Override
		public String toString() {
			
			return "This is the home ground of Mumbai Indians";
		}
	},
	
	CHIDAMBARAM_STADIUM{
		@Override
		public String toString() {
			return "This is the home ground of CSK";
		}
	},
	
	M_CHINNASWAMY_STADIUM{
		@Override
		public String toString() {
			
			return "This is the home ground of RCB";
		}
	}
}
