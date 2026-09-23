package org.apache.commons.compress.archivers.dump;

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
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_48254916655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43556;
     Object term43832;

    public DumpArchiveInputStream_readDirectoryEntry_48254916655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term43604 = new HashMap();
        term43556 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term43295 = (byte[]) newByteArray(4);
        setField(term43556, term43556.getClass(), "names", term43604);
        setByteElement(term43295, 0, (byte) 67);
        setByteElement(term43295, 1, (byte) 76);
        setByteElement(term43295, 2, (byte) 82);
        setByteElement(term43295, 3, (byte) 73);
        setField(term43556, term43556.getClass(), "blockBuffer", term43295);
        Class<? extends Object> term45225 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term45224 = ((Class) term45225).getDeclaredField((String) "END");
        ((Field) term45224).setAccessible(true);
        Object enum19 = ((Field) term45224).get((Object) null);
        term43832 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term43992 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term43832, term43832.getClass(), "size", 0L);
        setIntField(term43992, term43992.getClass(), "ino", 0);
        setField(term43992, term43992.getClass(), "type", enum19);
        setIntField(term43992, term43992.getClass(), "count", 2);
        setField(term43832, term43832.getClass(), "header", term43992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term43832;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term43556, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


