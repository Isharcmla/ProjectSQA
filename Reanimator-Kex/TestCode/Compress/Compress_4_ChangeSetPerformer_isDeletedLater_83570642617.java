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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;

public class ChangeSetPerformer_isDeletedLater_83570642617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3055;
     Object term3103;
     Object term3227;
     Object term3253;
     Object term3254;
     Object term3255;

    public ChangeSetPerformer_isDeletedLater_83570642617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3055 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        term3103 = new HashSet();
        term3227 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(term3227, term3227.getClass(), "name", null);
        term3253 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        setField(term3253, term3253.getClass(), "changes", null);
        term3254 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setShortField(term3254, term3254.getClass(), "fileFormat", (short) 0);
        setIntField(term3254, term3254.getClass(), "headerSize", 0);
        setIntField(term3254, term3254.getClass(), "alignmentBoundary", 0);
        setLongField(term3254, term3254.getClass(), "chksum", 0L);
        setLongField(term3254, term3254.getClass(), "filesize", 0L);
        setLongField(term3254, term3254.getClass(), "gid", 0L);
        setLongField(term3254, term3254.getClass(), "inode", 0L);
        setLongField(term3254, term3254.getClass(), "maj", 0L);
        setLongField(term3254, term3254.getClass(), "min", 0L);
        setLongField(term3254, term3254.getClass(), "mode", 0L);
        setLongField(term3254, term3254.getClass(), "mtime", 0L);
        setField(term3254, term3254.getClass(), "name", null);
        setLongField(term3254, term3254.getClass(), "nlink", 0L);
        setLongField(term3254, term3254.getClass(), "rmaj", 0L);
        setLongField(term3254, term3254.getClass(), "rmin", 0L);
        setLongField(term3254, term3254.getClass(), "uid", 0L);
        HashMap term3256 = new HashMap();
        Set<Object> term3258 =  ((Map) term3256).keySet();
        term3255 = new HashSet((Collection<? extends Object>) term3258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term3103;
        args[1] = term3227;
        Object retValue = callMethod(klass, "isDeletedLater", argTypes, term3055, args);
        assertTrue(recursiveEquals(term3055, term3253));
        assertTrue(recursiveEquals(term3103, term3254));
        assertTrue(recursiveEquals(term3227, term3255));
        assertTrue(recursiveEquals(retValue, false));
    }

};


