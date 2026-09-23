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
import java.io.IOException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class DumpArchiveInputStream_getNextDumpEntry_892138748114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75963;

    public DumpArchiveInputStream_getNextDumpEntry_892138748114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term76017 = new LinkedList();
        term75963 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term76141 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term76301 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        Object term76423 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(term75963, term75963.getClass(), "queue", term76017);
        setBooleanField(term75963, term75963.getClass(), "hasHitEOF", false);
        setIntField(term75963, term75963.getClass(), "readIdx", -2147483648);
        setIntField(term76301, term76301.getClass(), "count", -2147483648);
        setField(term76141, term76141.getClass(), "header", term76301);
        setField(term75963, term75963.getClass(), "active", term76141);
        setField(term75963, term75963.getClass(), "raw", term76423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNextDumpEntry", argTypes, term75963, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


