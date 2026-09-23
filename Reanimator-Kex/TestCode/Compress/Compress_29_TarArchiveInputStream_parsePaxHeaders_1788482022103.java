package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.util.HashMap;

public class TarArchiveInputStream_parsePaxHeaders_1788482022103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31502;
     Object term31634;
     Object term31673;
     Object term31674;
     Object term31661;

    public TarArchiveInputStream_parsePaxHeaders_1788482022103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31502 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term31634 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term31673 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term31673, term31673.getClass(), "SMALL_BUF", null);
        setIntField(term31673, term31673.getClass(), "recordSize", 0);
        setIntField(term31673, term31673.getClass(), "blockSize", 0);
        setBooleanField(term31673, term31673.getClass(), "hasHitEOF", false);
        setLongField(term31673, term31673.getClass(), "entrySize", 0L);
        setLongField(term31673, term31673.getClass(), "entryOffset", 0L);
        setField(term31673, term31673.getClass(), "is", null);
        setField(term31673, term31673.getClass(), "currEntry", null);
        setField(term31673, term31673.getClass(), "zipEncoding", null);
        setField(term31673, term31673.getClass(), "SINGLE", null);
        setLongField(term31673, term31673.getClass(), "bytesRead", 0L);
        term31674 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term31674, term31674.getClass(), "SMALL_BUF", null);
        setIntField(term31674, term31674.getClass(), "recordSize", 0);
        setIntField(term31674, term31674.getClass(), "blockSize", 0);
        setBooleanField(term31674, term31674.getClass(), "hasHitEOF", false);
        setLongField(term31674, term31674.getClass(), "entrySize", 0L);
        setLongField(term31674, term31674.getClass(), "entryOffset", 0L);
        setField(term31674, term31674.getClass(), "is", null);
        setField(term31674, term31674.getClass(), "currEntry", null);
        setField(term31674, term31674.getClass(), "zipEncoding", null);
        setField(term31674, term31674.getClass(), "SINGLE", null);
        setLongField(term31674, term31674.getClass(), "bytesRead", 0L);
        term31661 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term31634;
        Object retValue = callMethod(klass, "parsePaxHeaders", argTypes, term31502, args);
        assertTrue(recursiveEquals(term31502, term31673));
        assertTrue(recursiveEquals(term31634, term31674));
        assertTrue(recursiveEquals(retValue, term31661));
    }

};


