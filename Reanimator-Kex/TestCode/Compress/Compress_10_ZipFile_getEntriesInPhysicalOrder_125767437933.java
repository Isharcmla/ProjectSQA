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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class ZipFile_getEntriesInPhysicalOrder_125767437933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1085;
     Object term9239;
     Object term9183;

    public ZipFile_getEntriesInPhysicalOrder_125767437933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1086 = new HashMap();
        HashMap term1110 = new HashMap();
        ArrayList term1160 = new ArrayList();
        ((ArrayList) term1160).add((Object)null);
        ((ArrayList) term1160).add((Object)null);
        ((ArrayList) term1160).add((Object)null);
        ((ArrayList) term1160).add((Object)null);
        ((ArrayList) term1160).add((Object)null);
        ((ArrayList) term1160).add((Object)null);
        ((ArrayList) term1160).add((Object)null);
        ((ArrayList) term1160).add((Object)null);
        term1085 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term1156 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term1157 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term1085, term1085.getClass(), "entries", term1086);
        setField(term1085, term1085.getClass(), "nameMap", term1110);
        setField(term1085, term1085.getClass(), "encoding", "dEnhdmILtU");
        setField(term1085, term1085.getClass(), "zipEncoding", null);
        setField(term1085, term1085.getClass(), "archiveName", "hoicvmsovO");
        setIntField(term1157, term1157.getClass(), "fd", -1);
        setLongField(term1157, term1157.getClass(), "handle", -1L);
        setField(term1157, term1157.getClass(), "parent", null);
        setField(term1157, term1157.getClass(), "otherParents", term1160);
        setBooleanField(term1157, term1157.getClass(), "closed", true);
        setBooleanField(term1157, term1157.getClass(), "append", false);
        setField(term1157, term1157.getClass(), "cleanup", null);
        setField(term1156, term1156.getClass(), "fd", term1157);
        setField(term1156, term1156.getClass(), "channel", null);
        setBooleanField(term1156, term1156.getClass(), "rw", false);
        setField(term1156, term1156.getClass(), "path", null);
        setField(term1156, term1156.getClass(), "closed", null);
        setField(term1085, term1085.getClass(), "archive", term1156);
        setBooleanField(term1085, term1085.getClass(), "useUnicodeExtraFields", false);
        setBooleanField(term1085, term1085.getClass(), "closed", true);
        setField(term1085, term1085.getClass(), "OFFSET_COMPARATOR", null);
        HashMap term9240 = new HashMap();
        HashMap term9242 = new HashMap();
        ArrayList term9249 = new ArrayList();
        ((ArrayList) term9249).add((Object)null);
        ((ArrayList) term9249).add((Object)null);
        ((ArrayList) term9249).add((Object)null);
        ((ArrayList) term9249).add((Object)null);
        ((ArrayList) term9249).add((Object)null);
        ((ArrayList) term9249).add((Object)null);
        ((ArrayList) term9249).add((Object)null);
        ((ArrayList) term9249).add((Object)null);
        term9239 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term9247 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term9248 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term9239, term9239.getClass(), "entries", term9240);
        setField(term9239, term9239.getClass(), "nameMap", term9242);
        setField(term9239, term9239.getClass(), "encoding", "dEnhdmILtU");
        setField(term9239, term9239.getClass(), "zipEncoding", null);
        setField(term9239, term9239.getClass(), "archiveName", "hoicvmsovO");
        setIntField(term9248, term9248.getClass(), "fd", -1);
        setLongField(term9248, term9248.getClass(), "handle", -1L);
        setField(term9248, term9248.getClass(), "parent", null);
        setField(term9248, term9248.getClass(), "otherParents", term9249);
        setBooleanField(term9248, term9248.getClass(), "closed", true);
        setBooleanField(term9248, term9248.getClass(), "append", false);
        setField(term9248, term9248.getClass(), "cleanup", null);
        setField(term9247, term9247.getClass(), "fd", term9248);
        setField(term9247, term9247.getClass(), "channel", null);
        setBooleanField(term9247, term9247.getClass(), "rw", false);
        setField(term9247, term9247.getClass(), "path", null);
        setField(term9247, term9247.getClass(), "closed", null);
        setField(term9239, term9239.getClass(), "archive", term9247);
        setBooleanField(term9239, term9239.getClass(), "useUnicodeExtraFields", false);
        setBooleanField(term9239, term9239.getClass(), "closed", true);
        setField(term9239, term9239.getClass(), "OFFSET_COMPARATOR", null);
        term9183 = newInstance(Class.forName("java.util.Collections$3"));
        Object term9184 = newInstance(Class.forName("java.util.Arrays$ArrayItr"));
        Object[] term9186 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", 0);
        Object term9187 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term9188 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", 0);
        setIntField(term9184, term9184.getClass(), "cursor", 0);
        setField(term9184, term9184.getClass(), "a", term9186);
        setField(term9183, term9183.getClass(), "i", term9184);
        setField(term9187, term9187.getClass(), "a", term9188);
        setIntField(term9187, term9187.getClass(), "modCount", 0);
        setField(term9183, term9183.getClass(), "val$c", term9187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEntriesInPhysicalOrder", argTypes, term1085, args);
        assertTrue(recursiveEquals(term1085, term9239));
        assertTrue(recursiveEquals(retValue, term9183));
    }

};


