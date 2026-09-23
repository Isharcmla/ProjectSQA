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

public class TarArchiveInputStream_skipRecordPadding_108419379105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43652;
     Object term43673;

    public TarArchiveInputStream_skipRecordPadding_108419379105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43652 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setLongField(term43652, term43652.getClass(), "entrySize", 5099732100572687016L);
        setIntField(term43652, term43652.getClass(), "recordSize", -1512046592);
        setField(term43652, term43652.getClass(), "is", null);
        term43673 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term43673, term43673.getClass(), "SMALL_BUF", null);
        setIntField(term43673, term43673.getClass(), "recordSize", -1512046592);
        setIntField(term43673, term43673.getClass(), "blockSize", 0);
        setBooleanField(term43673, term43673.getClass(), "hasHitEOF", false);
        setLongField(term43673, term43673.getClass(), "entrySize", 5099732100572687016L);
        setLongField(term43673, term43673.getClass(), "entryOffset", 0L);
        setField(term43673, term43673.getClass(), "is", null);
        setField(term43673, term43673.getClass(), "currEntry", null);
        setField(term43673, term43673.getClass(), "encoding", null);
        setField(term43673, term43673.getClass(), "SINGLE", null);
        setLongField(term43673, term43673.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipRecordPadding", argTypes, term43652, args);
        assertTrue(recursiveEquals(term43652, term43673));
    }

};


