package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class ZipFile_close_35607714430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term773;

    public ZipFile_close_35607714430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term774 = new HashMap();
        HashMap term798 = new HashMap();
        ArrayList term848 = new ArrayList();
        ((ArrayList) term848).add((Object)null);
        ((ArrayList) term848).add((Object)null);
        term773 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term844 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term845 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term773, term773.getClass(), "entries", term774);
        setField(term773, term773.getClass(), "nameMap", term798);
        setField(term773, term773.getClass(), "encoding", "IoAlmYsBwc");
        setField(term773, term773.getClass(), "zipEncoding", null);
        setField(term773, term773.getClass(), "archiveName", "TEParAifyi");
        setIntField(term845, term845.getClass(), "fd", -1);
        setLongField(term845, term845.getClass(), "handle", -1L);
        setField(term845, term845.getClass(), "parent", null);
        setField(term845, term845.getClass(), "otherParents", term848);
        setBooleanField(term845, term845.getClass(), "closed", true);
        setBooleanField(term845, term845.getClass(), "append", true);
        setField(term845, term845.getClass(), "cleanup", null);
        setField(term844, term844.getClass(), "fd", term845);
        setField(term844, term844.getClass(), "channel", null);
        setBooleanField(term844, term844.getClass(), "rw", false);
        setField(term844, term844.getClass(), "path", null);
        setField(term844, term844.getClass(), "closed", null);
        setField(term773, term773.getClass(), "archive", term844);
        setBooleanField(term773, term773.getClass(), "useUnicodeExtraFields", true);
        setBooleanField(term773, term773.getClass(), "closed", false);
        setField(term773, term773.getClass(), "OFFSET_COMPARATOR", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term773, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


