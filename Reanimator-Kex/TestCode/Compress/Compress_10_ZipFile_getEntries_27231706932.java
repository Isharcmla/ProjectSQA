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

public class ZipFile_getEntries_27231706932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term981;
     Object term9131;
     Object term9078;

    public ZipFile_getEntries_27231706932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term982 = new HashMap();
        HashMap term1006 = new HashMap();
        ArrayList term1056 = new ArrayList();
        ((ArrayList) term1056).add((Object)null);
        ((ArrayList) term1056).add((Object)null);
        ((ArrayList) term1056).add((Object)null);
        ((ArrayList) term1056).add((Object)null);
        ((ArrayList) term1056).add((Object)null);
        term981 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term1052 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term1053 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term981, term981.getClass(), "entries", term982);
        setField(term981, term981.getClass(), "nameMap", term1006);
        setField(term981, term981.getClass(), "encoding", "nGKItKLYNC");
        setField(term981, term981.getClass(), "zipEncoding", null);
        setField(term981, term981.getClass(), "archiveName", "UiUYnPrcCi");
        setIntField(term1053, term1053.getClass(), "fd", -1);
        setLongField(term1053, term1053.getClass(), "handle", -1L);
        setField(term1053, term1053.getClass(), "parent", null);
        setField(term1053, term1053.getClass(), "otherParents", term1056);
        setBooleanField(term1053, term1053.getClass(), "closed", true);
        setBooleanField(term1053, term1053.getClass(), "append", false);
        setField(term1053, term1053.getClass(), "cleanup", null);
        setField(term1052, term1052.getClass(), "fd", term1053);
        setField(term1052, term1052.getClass(), "channel", null);
        setBooleanField(term1052, term1052.getClass(), "rw", false);
        setField(term1052, term1052.getClass(), "path", null);
        setField(term1052, term1052.getClass(), "closed", null);
        setField(term981, term981.getClass(), "archive", term1052);
        setBooleanField(term981, term981.getClass(), "useUnicodeExtraFields", false);
        setBooleanField(term981, term981.getClass(), "closed", true);
        setField(term981, term981.getClass(), "OFFSET_COMPARATOR", null);
        HashMap term9132 = new HashMap();
        HashMap term9134 = new HashMap();
        ArrayList term9141 = new ArrayList();
        ((ArrayList) term9141).add((Object)null);
        ((ArrayList) term9141).add((Object)null);
        ((ArrayList) term9141).add((Object)null);
        ((ArrayList) term9141).add((Object)null);
        ((ArrayList) term9141).add((Object)null);
        term9131 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term9139 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term9140 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term9131, term9131.getClass(), "entries", term9132);
        setField(term9131, term9131.getClass(), "nameMap", term9134);
        setField(term9131, term9131.getClass(), "encoding", "nGKItKLYNC");
        setField(term9131, term9131.getClass(), "zipEncoding", null);
        setField(term9131, term9131.getClass(), "archiveName", "UiUYnPrcCi");
        setIntField(term9140, term9140.getClass(), "fd", -1);
        setLongField(term9140, term9140.getClass(), "handle", -1L);
        setField(term9140, term9140.getClass(), "parent", null);
        setField(term9140, term9140.getClass(), "otherParents", term9141);
        setBooleanField(term9140, term9140.getClass(), "closed", true);
        setBooleanField(term9140, term9140.getClass(), "append", false);
        setField(term9140, term9140.getClass(), "cleanup", null);
        setField(term9139, term9139.getClass(), "fd", term9140);
        setField(term9139, term9139.getClass(), "channel", null);
        setBooleanField(term9139, term9139.getClass(), "rw", false);
        setField(term9139, term9139.getClass(), "path", null);
        setField(term9139, term9139.getClass(), "closed", null);
        setField(term9131, term9131.getClass(), "archive", term9139);
        setBooleanField(term9131, term9131.getClass(), "useUnicodeExtraFields", false);
        setBooleanField(term9131, term9131.getClass(), "closed", true);
        setField(term9131, term9131.getClass(), "OFFSET_COMPARATOR", null);
        HashMap term9080 = new HashMap();
        term9078 = newInstance(Class.forName("java.util.Collections$3"));
        Object term9079 = newInstance(Class.forName("java.util.HashMap$KeyIterator"));
        Object term9085 = newInstance(Class.forName("java.util.HashMap$KeySet"));
        setField(term9079, term9079.getClass(), "this$0", term9080);
        setField(term9079, term9079.getClass(), "next", null);
        setField(term9079, term9079.getClass(), "current", null);
        setIntField(term9079, term9079.getClass(), "expectedModCount", 0);
        setIntField(term9079, term9079.getClass(), "index", 0);
        setField(term9078, term9078.getClass(), "i", term9079);
        setField(term9085, term9085.getClass(), "this$0", term9080);
        setField(term9078, term9078.getClass(), "val$c", term9085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEntries", argTypes, term981, args);
        assertTrue(recursiveEquals(term981, term9131));
        assertTrue(recursiveEquals(retValue, term9078));
    }

};


