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
import java.lang.ClassCastException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;

public class DumpArchiveInputStream_getPath_1393655587102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68595;
     Object term68995;

    public DumpArchiveInputStream_getPath_1393655587102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term68743 = new Integer(0);
        Object term68781 = newInstance(Class.forName("java.lang.Object"));
        HashMap term68643 = new HashMap();
        ((HashMap) term68643).put(term68743, term68743);
        ((HashMap) term68643).put((Object)null, (Object)null);
        ((HashMap) term68643).put((Object)null, (Object)null);
        ((HashMap) term68643).put((Object)null, (Object)null);
        ((HashMap) term68643).put(term68781, term68781);
        ((HashMap) term68643).put((Object)null, (Object)null);
        ((HashMap) term68643).put((Object)null, (Object)null);
        ((HashMap) term68643).put((Object)null, (Object)null);
        ((HashMap) term68643).put((Object)null, (Object)null);
        term68595 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term68595, term68595.getClass(), "names", term68643);
        term68995 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term69155 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setIntField(term69155, term69155.getClass(), "ino", 0);
        setField(term68995, term68995.getClass(), "header", term69155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term68995;
        try {
            callMethod(klass, "getPath", argTypes, term68595, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


