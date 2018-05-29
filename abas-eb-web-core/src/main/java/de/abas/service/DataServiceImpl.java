package de.abas.service;

class DataServiceImpl implements DataService {

	private final String criteria;

	@java.beans.ConstructorProperties({"criteria"})
	public DataServiceImpl(String criteria) {
		this.criteria = criteria;
	}

	public String foo22() {
		return String.format("foo22### criteria: %s, time: %d", criteria, System.currentTimeMillis());
	}

	public String getCriteria() {
		return this.criteria;
	}

	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof DataServiceImpl)) return false;
		final DataServiceImpl other = (DataServiceImpl) o;
		final Object this$criteria = this.getCriteria();
		final Object other$criteria = other.getCriteria();
		if (this$criteria == null ? other$criteria != null : !this$criteria.equals(other$criteria)) return false;
		return true;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $criteria = this.getCriteria();
		result = result * PRIME + ($criteria == null ? 43 : $criteria.hashCode());
		return result;
	}

	public String toString() {
		return "DataServiceImpl(criteria=" + this.getCriteria() + ")";
	}
}
