package org.apache.commons.compress.changes;

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
import static org.apache.commons.compress.changes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.changes.EqualityUtils.*;
import java.util.HashSet;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class ChangeSetPerformer_isDeletedLater_83570642695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30945;
     Object term30993;
     Object term31397;
     Object term31776;
     Object term31777;
     Object term31780;

    public ChangeSetPerformer_isDeletedLater_83570642695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30945 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        Object term31183 = newInstance(Class.forName("org.apache.commons.compress.changes.Change"));
        setIntField(term31183, term31183.getClass(), "type", 4);
        setField(term31183, term31183.getClass(), "targetFile", null);
        term30993 = new HashSet();
        ((HashSet) term30993).add(term31183);
        term31397 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(term31397, term31397.getClass(), "name", "");
        term31776 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        setField(term31776, term31776.getClass(), "changes", null);
        term31777 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setShortField(term31777, term31777.getClass(), "fileFormat", (short) 0);
        setIntField(term31777, term31777.getClass(), "headerSize", 0);
        setIntField(term31777, term31777.getClass(), "alignmentBoundary", 0);
        setLongField(term31777, term31777.getClass(), "chksum", 0L);
        setLongField(term31777, term31777.getClass(), "filesize", 0L);
        setLongField(term31777, term31777.getClass(), "gid", 0L);
        setLongField(term31777, term31777.getClass(), "inode", 0L);
        setLongField(term31777, term31777.getClass(), "maj", 0L);
        setLongField(term31777, term31777.getClass(), "min", 0L);
        setLongField(term31777, term31777.getClass(), "mode", 0L);
        setLongField(term31777, term31777.getClass(), "mtime", 0L);
        setField(term31777, term31777.getClass(), "name", "");
        setLongField(term31777, term31777.getClass(), "nlink", 0L);
        setLongField(term31777, term31777.getClass(), "rmaj", 0L);
        setLongField(term31777, term31777.getClass(), "rmin", 0L);
        setLongField(term31777, term31777.getClass(), "uid", 0L);
        HashMap term31781 = new HashMap();
        Set<Object> term31788 =  ((Map) term31781).keySet();
        term31780 = new HashSet((Collection<? extends Object>) term31788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term30993;
        args[1] = term31397;
        Object retValue = callMethod(klass, "isDeletedLater", argTypes, term30945, args);
        assertTrue(recursiveEquals(term30945, term31776));
        assertTrue(recursiveEquals(term30993, term31777));
        assertTrue(recursiveEquals(term31397, term31780));
        assertTrue(recursiveEquals(retValue, false));
    }

};


