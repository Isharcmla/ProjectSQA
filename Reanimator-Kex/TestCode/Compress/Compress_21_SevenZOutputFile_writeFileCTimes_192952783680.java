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
import java.util.ArrayList;
import java.lang.Object;

public class SevenZOutputFile_writeFileCTimes_192952783680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41919;

    public SevenZOutputFile_writeFileCTimes_192952783680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42103 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setBooleanField(term42103, term42103.getClass(), "hasCreationDate", false);
        Object term42235 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setBooleanField(term42235, term42235.getClass(), "hasCreationDate", true);
        ArrayList term41971 = new ArrayList();
        ((ArrayList) term41971).add(term42103);
        ((ArrayList) term41971).add(term42103);
        ((ArrayList) term41971).add(term42103);
        ((ArrayList) term41971).add(term42103);
        ((ArrayList) term41971).add(term42235);
        ((ArrayList) term41971).add(term42103);
        term41919 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(term41919, term41919.getClass(), "files", term41971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeFileCTimes", argTypes, term41919, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


