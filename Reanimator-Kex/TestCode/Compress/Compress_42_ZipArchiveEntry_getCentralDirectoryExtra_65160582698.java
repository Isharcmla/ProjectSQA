package org.apache.commons.compress.archivers.zip;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ZipArchiveEntry_getCentralDirectoryExtra_65160582698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43023;

    public ZipArchiveEntry_getCentralDirectoryExtra_65160582698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43023 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term43023, term43023.getClass(), "method", 0);
        setLongField(term43023, term43023.getClass(), "size", 0L);
        setIntField(term43023, term43023.getClass(), "internalAttributes", 0);
        setIntField(term43023, term43023.getClass(), "versionRequired", 0);
        setIntField(term43023, term43023.getClass(), "versionMadeBy", 0);
        setIntField(term43023, term43023.getClass(), "platform", 0);
        setIntField(term43023, term43023.getClass(), "rawFlag", 0);
        setLongField(term43023, term43023.getClass(), "externalAttributes", 0L);
        setField(term43023, term43023.getClass(), "extraFields", null);
        setField(term43023, term43023.getClass(), "unparseableExtra", null);
        setField(term43023, term43023.getClass(), "name", null);
        setField(term43023, term43023.getClass(), "rawName", null);
        setField(term43023, term43023.getClass(), "gpb", null);
        setLongField(term43023, term43023.getClass(), "xdostime", 0L);
        setField(term43023, term43023.getClass(), "mtime", null);
        setField(term43023, term43023.getClass(), "atime", null);
        setField(term43023, term43023.getClass(), "ctime", null);
        setLongField(term43023, term43023.getClass(), "crc", 0L);
        setLongField(term43023, term43023.getClass(), "csize", 0L);
        setIntField(term43023, term43023.getClass(), "flag", 0);
        setField(term43023, term43023.getClass(), "extra", null);
        setField(term43023, term43023.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCentralDirectoryExtra", argTypes, term43023, args);
    }

};


