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

public class DumpArchiveInputStream_readDirectoryEntry_48254916674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54101;
     Object term54425;

    public DumpArchiveInputStream_readDirectoryEntry_48254916674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term54149 = new HashMap();
        HashMap term54301 = new HashMap();
        term54101 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term54101, term54101.getClass(), "names", term54149);
        setField(term54101, term54101.getClass(), "pending", term54301);
        Class<? extends Object> term55577 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term55576 = ((Class) term55577).getDeclaredField((String) "INODE");
        ((Field) term55576).setAccessible(true);
        Object enum25 = ((Field) term55576).get((Object) null);
        term54425 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term54585 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term54425, term54425.getClass(), "size", 0L);
        setIntField(term54585, term54585.getClass(), "ino", 0);
        setField(term54585, term54585.getClass(), "type", enum25);
        setField(term54425, term54425.getClass(), "header", term54585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term54425;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term54101, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


