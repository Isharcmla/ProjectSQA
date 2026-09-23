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

public class SevenZOutputFile_writeFileCTimes_192952783693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77328;
     Object term77878;

    public SevenZOutputFile_writeFileCTimes_192952783693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term77512 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setBooleanField(term77512, term77512.getClass(), "hasCreationDate", false);
        Object term77644 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setBooleanField(term77644, term77644.getClass(), "hasCreationDate", false);
        Object term77776 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setBooleanField(term77776, term77776.getClass(), "hasCreationDate", true);
        ArrayList term77380 = new ArrayList();
        ((ArrayList) term77380).add(term77512);
        ((ArrayList) term77380).add(term77644);
        ((ArrayList) term77380).add(term77644);
        ((ArrayList) term77380).add(term77644);
        ((ArrayList) term77380).add(term77776);
        ((ArrayList) term77380).add(term77644);
        ((ArrayList) term77380).add(term77644);
        ((ArrayList) term77380).add(term77644);
        term77328 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(term77328, term77328.getClass(), "files", term77380);
        term77878 = newInstance(Class.forName("java.io.ObjectOutputStream$BlockDataOutputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = term77878;
        try {
            callMethod(klass, "writeFileCTimes", argTypes, term77328, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


