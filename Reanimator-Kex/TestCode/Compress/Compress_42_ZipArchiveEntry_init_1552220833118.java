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
import java.lang.Object;

public class ZipArchiveEntry_init_1552220833118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44670;

    public ZipArchiveEntry_init_1552220833118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44410 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term44743 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term44550 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term44243 = (byte[]) newByteArray(0);
        setLongField(term44410, term44410.getClass(), "xdostime", 0L);
        setLongField(term44410, term44410.getClass(), "crc", 0L);
        setLongField(term44410, term44410.getClass(), "size", 0L);
        setLongField(term44410, term44410.getClass(), "csize", 0L);
        setIntField(term44410, term44410.getClass(), "method", 0);
        setIntField(term44410, term44410.getClass(), "flag", 0);
        setField(term44410, term44410.getClass(), "name", null);
        setField(term44410, term44410.getClass(), "mtime", null);
        setField(term44410, term44410.getClass(), "atime", term44743);
        setField(term44410, term44410.getClass(), "ctime", term44550);
        setField(term44410, term44410.getClass(), "extra", term44243);
        setField(term44410, term44410.getClass(), "comment", null);
        setIntField(term44410, term44410.getClass(), "internalAttributes", 0);
        setIntField(term44410, term44410.getClass(), "platform", 0);
        setLongField(term44410, term44410.getClass(), "externalAttributes", 0L);
        setField(term44410, term44410.getClass(), "unparseableExtra", null);
        setField(term44410, term44410.getClass(), "rawName", term44243);
        setField(term44410, term44410.getClass(), "gpb", null);
        term44670 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        byte[] term43497 = (byte[]) newByteArray(745);
        setField(term44670, term44670.getClass(), "name", "");
        setLongField(term44670, term44670.getClass(), "xdostime", 0L);
        setField(term44670, term44670.getClass(), "mtime", term44743);
        setField(term44670, term44670.getClass(), "atime", null);
        setField(term44670, term44670.getClass(), "ctime", null);
        setLongField(term44670, term44670.getClass(), "crc", 0L);
        setLongField(term44670, term44670.getClass(), "size", 0L);
        setLongField(term44670, term44670.getClass(), "csize", 0L);
        setIntField(term44670, term44670.getClass(), "method", 0);
        setIntField(term44670, term44670.getClass(), "flag", 0);
        setByteElement(term43497, 0, (byte) 47);
        setField(term44670, term44670.getClass(), "extra", term43497);
        setField(term44670, term44670.getClass(), "comment", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.zip.ZipEntry");
        Object[] args = new Object[1];
        args[0] = term44670;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


