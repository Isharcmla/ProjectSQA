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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SevenZFile_calculateStreamMap_204221884858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22905;

    public SevenZFile_calculateStreamMap_204221884858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22905 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        setField(term22905, term22905.getClass(), "fileName", null);
        setField(term22905, term22905.getClass(), "file", null);
        setField(term22905, term22905.getClass(), "archive", null);
        setIntField(term22905, term22905.getClass(), "currentEntryIndex", 0);
        setIntField(term22905, term22905.getClass(), "currentFolderIndex", 0);
        setField(term22905, term22905.getClass(), "currentFolderInputStream", null);
        setField(term22905, term22905.getClass(), "password", null);
        setField(term22905, term22905.getClass(), "deferredBlockStreams", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "calculateStreamMap", argTypes, term22905, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


