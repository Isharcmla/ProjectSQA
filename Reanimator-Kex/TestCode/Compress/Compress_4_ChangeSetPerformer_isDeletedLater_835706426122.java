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

public class ChangeSetPerformer_isDeletedLater_835706426122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47027;
     Object term47075;
     Object term47475;
     Object term48255;
     Object term48256;
     Object term48259;

    public ChangeSetPerformer_isDeletedLater_835706426122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47027 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        Object term47265 = newInstance(Class.forName("org.apache.commons.compress.changes.Change"));
        setIntField(term47265, term47265.getClass(), "type", 4);
        setField(term47265, term47265.getClass(), "targetFile", "");
        term47075 = new HashSet();
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        ((HashSet) term47075).add(term47265);
        term47475 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term47475, term47475.getClass(), "name", "");
        term48255 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        setField(term48255, term48255.getClass(), "changes", null);
        term48256 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term48256, term48256.getClass(), "name", "");
        setIntField(term48256, term48256.getClass(), "mode", 0);
        setIntField(term48256, term48256.getClass(), "userId", 0);
        setIntField(term48256, term48256.getClass(), "groupId", 0);
        setLongField(term48256, term48256.getClass(), "size", 0L);
        setLongField(term48256, term48256.getClass(), "modTime", 0L);
        setByteField(term48256, term48256.getClass(), "linkFlag", (byte) 0);
        setField(term48256, term48256.getClass(), "linkName", null);
        setField(term48256, term48256.getClass(), "magic", null);
        setField(term48256, term48256.getClass(), "version", null);
        setField(term48256, term48256.getClass(), "userName", null);
        setField(term48256, term48256.getClass(), "groupName", null);
        setIntField(term48256, term48256.getClass(), "devMajor", 0);
        setIntField(term48256, term48256.getClass(), "devMinor", 0);
        setField(term48256, term48256.getClass(), "file", null);
        HashMap term48260 = new HashMap();
        Set<Object> term48267 =  ((Map) term48260).keySet();
        term48259 = new HashSet((Collection<? extends Object>) term48267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term47075;
        args[1] = term47475;
        Object retValue = callMethod(klass, "isDeletedLater", argTypes, term47027, args);
        assertTrue(recursiveEquals(term47027, term48255));
        assertTrue(recursiveEquals(term47075, term48256));
        assertTrue(recursiveEquals(term47475, term48259));
        assertTrue(recursiveEquals(retValue, false));
    }

};


