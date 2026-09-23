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

public class ZipArchiveEntry_init_66477677358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37766;

    public ZipArchiveEntry_init_66477677358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37766 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term37769 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        setIntField(term37766, term37766.getClass(), "method", -1);
        setLongField(term37766, term37766.getClass(), "size", -1L);
        setIntField(term37766, term37766.getClass(), "internalAttributes", 0);
        setIntField(term37766, term37766.getClass(), "versionRequired", 0);
        setIntField(term37766, term37766.getClass(), "versionMadeBy", 0);
        setIntField(term37766, term37766.getClass(), "platform", 0);
        setIntField(term37766, term37766.getClass(), "rawFlag", 0);
        setLongField(term37766, term37766.getClass(), "externalAttributes", 0L);
        setField(term37766, term37766.getClass(), "extraFields", null);
        setField(term37766, term37766.getClass(), "unparseableExtra", null);
        setField(term37766, term37766.getClass(), "name", "PAEBtnZtTD");
        setField(term37766, term37766.getClass(), "rawName", null);
        setBooleanField(term37769, term37769.getClass(), "languageEncodingFlag", false);
        setBooleanField(term37769, term37769.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term37769, term37769.getClass(), "encryptionFlag", false);
        setBooleanField(term37769, term37769.getClass(), "strongEncryptionFlag", false);
        setIntField(term37769, term37769.getClass(), "slidingDictionarySize", 0);
        setIntField(term37769, term37769.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term37766, term37766.getClass(), "gpb", term37769);
        setLongField(term37766, term37766.getClass(), "xdostime", -1L);
        setField(term37766, term37766.getClass(), "mtime", null);
        setField(term37766, term37766.getClass(), "atime", null);
        setField(term37766, term37766.getClass(), "ctime", null);
        setLongField(term37766, term37766.getClass(), "crc", -1L);
        setLongField(term37766, term37766.getClass(), "csize", -1L);
        setIntField(term37766, term37766.getClass(), "flag", 0);
        setField(term37766, term37766.getClass(), "extra", null);
        setField(term37766, term37766.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term37766));
    }

};


