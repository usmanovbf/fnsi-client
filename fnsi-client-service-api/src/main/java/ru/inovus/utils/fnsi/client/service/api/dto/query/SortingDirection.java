package ru.inovus.utils.fnsi.client.service.api.dto.query;

public enum SortingDirection {
    ASC, DESC;

    @Override
    public String toString() {
        return this.name();
    }
}
