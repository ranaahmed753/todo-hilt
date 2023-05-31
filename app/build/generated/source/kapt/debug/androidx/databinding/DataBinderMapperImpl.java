package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new edu.notes.hiltapp.DataBinderMapperImpl());
  }
}
