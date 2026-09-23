package org.apache.commons.compress.archivers.sevenz;

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
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.sevenz.EqualityUtils.*;

public class SevenZFile_readBits_196202128561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26893;
     Object term27444;
     Object term27436;

    public SevenZFile_readBits_196202128561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26893 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term27444 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        setField(term27444, term27444.getClass(), "fileName", null);
        setField(term27444, term27444.getClass(), "file", null);
        setField(term27444, term27444.getClass(), "archive", null);
        setIntField(term27444, term27444.getClass(), "currentEntryIndex", 0);
        setIntField(term27444, term27444.getClass(), "currentFolderIndex", 0);
        setField(term27444, term27444.getClass(), "currentFolderInputStream", null);
        setField(term27444, term27444.getClass(), "password", null);
        setField(term27444, term27444.getClass(), "deferredBlockStreams", null);
        term27436 = newInstance(Class.forName("java.util.BitSet"));
        long[] term27437 = (long[]) newLongArray(0);
        setField(term27436, term27436.getClass(), "words", term27437);
        setIntField(term27436, term27436.getClass(), "wordsInUse", 0);
        setBooleanField(term27436, term27436.getClass(), "sizeIsSticky", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = 0;
        Object retValue = callMethod(klass, "readBits", argTypes, term26893, args);
        assertTrue(recursiveEquals(term26893, term27444));
        assertTrue(recursiveEquals(retValue, term27436));
    }

};


