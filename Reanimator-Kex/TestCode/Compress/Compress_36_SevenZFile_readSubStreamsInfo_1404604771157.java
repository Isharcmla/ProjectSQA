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
import java.lang.Object;

public class SevenZFile_readSubStreamsInfo_1404604771157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67529;
     Object term67627;
     Object term67737;

    public SevenZFile_readSubStreamsInfo_1404604771157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67529 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term67627 = newInstance(Class.forName("java.io.ObjectInputStream$BlockDataInputStream"));
        term67737 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term67377 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 3);
        Object term67845 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        Object term67953 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        setIntField(term67845, term67845.getClass(), "numUnpackSubStreams", 0);
        setElement(term67377, 0, term67845);
        setIntField(term67953, term67953.getClass(), "numUnpackSubStreams", 0);
        setElement(term67377, 1, term67953);
        setElement(term67377, 2, term67953);
        setField(term67737, term67737.getClass(), "folders", term67377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = term67627;
        args[1] = term67737;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term67529, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


