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
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;
import java.lang.Object;

public class ZipArchiveEntry_init_66477677343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27826;

    public ZipArchiveEntry_init_66477677343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27826 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term27829 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        setIntField(term27826, term27826.getClass(), "method", -1);
        setLongField(term27826, term27826.getClass(), "size", -1L);
        setIntField(term27826, term27826.getClass(), "internalAttributes", 0);
        setIntField(term27826, term27826.getClass(), "platform", 0);
        setLongField(term27826, term27826.getClass(), "externalAttributes", 0L);
        setField(term27826, term27826.getClass(), "extraFields", null);
        setField(term27826, term27826.getClass(), "unparseableExtra", null);
        setField(term27826, term27826.getClass(), "name", "PAEBtnZtTD");
        setField(term27826, term27826.getClass(), "rawName", null);
        setBooleanField(term27829, term27829.getClass(), "languageEncodingFlag", false);
        setBooleanField(term27829, term27829.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term27829, term27829.getClass(), "encryptionFlag", false);
        setBooleanField(term27829, term27829.getClass(), "strongEncryptionFlag", false);
        setField(term27826, term27826.getClass(), "gpb", term27829);
        setLongField(term27826, term27826.getClass(), "xdostime", -1L);
        setField(term27826, term27826.getClass(), "mtime", null);
        setField(term27826, term27826.getClass(), "atime", null);
        setField(term27826, term27826.getClass(), "ctime", null);
        setLongField(term27826, term27826.getClass(), "crc", -1L);
        setLongField(term27826, term27826.getClass(), "csize", -1L);
        setIntField(term27826, term27826.getClass(), "flag", 0);
        setField(term27826, term27826.getClass(), "extra", null);
        setField(term27826, term27826.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term27826));
    }

};


