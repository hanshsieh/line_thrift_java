# LINE Thrift Java
LINE Java library generated from thrift file.
This isn't official Java client. This is generated from the Thrift file of LINE internal protocol that is used
by desktop client. The thrift file s based on the [file](http://altrepo.eu/git/line-protocol/blob/master/line.thrift),
and has been modified a little.
The Java code was generated with the following command on Windows:

```bash
thrift-0.9.3.exe --gen java:beans=,fullcamel= line.thrift
```

It was generated from Thrift 0.9.3 instead of 0.10.0 because TServiceClient in 0.10.0 will print log
in the stdout. It has been resolved by a [ticket](https://issues.apache.org/jira/browse/THRIFT-4062), but it hasn't
been shipped with new release version.
