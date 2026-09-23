package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class TarArchiveEntry_getModTime_796659337109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6543;
     Object term30494;
     Object term30428;

    public TarArchiveEntry_getModTime_796659337109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30535 = Class.forName((String) "java.io.File$PathStatus");
        Field term30534 = ((Class) term30535).getDeclaredField((String) "CHECKED");
        ((Field) term30534).setAccessible(true);
        Object enum125 = ((Field) term30534).get((Object) null);
        term6543 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term6582 = newInstance(Class.forName("java.io.File"));
        setField(term6543, term6543.getClass(), "name", "");
        setBooleanField(term6543, term6543.getClass(), "preserveLeadingSlashes", false);
        setIntField(term6543, term6543.getClass(), "mode", 691577392);
        setLongField(term6543, term6543.getClass(), "userId", 8802866251294305945L);
        setLongField(term6543, term6543.getClass(), "groupId", 4513004407927379358L);
        setLongField(term6543, term6543.getClass(), "size", -7115418542247301000L);
        setLongField(term6543, term6543.getClass(), "modTime", 8034714140377562739L);
        setBooleanField(term6543, term6543.getClass(), "checkSumOK", true);
        setByteField(term6543, term6543.getClass(), "linkFlag", (byte) 42);
        setField(term6543, term6543.getClass(), "linkName", "");
        setField(term6543, term6543.getClass(), "magic", "ustar ");
        setField(term6543, term6543.getClass(), "version", "00");
        setField(term6543, term6543.getClass(), "userName", "root");
        setField(term6543, term6543.getClass(), "groupName", "");
        setIntField(term6543, term6543.getClass(), "devMajor", -893623680);
        setIntField(term6543, term6543.getClass(), "devMinor", -1963434938);
        setBooleanField(term6543, term6543.getClass(), "isExtended", true);
        setLongField(term6543, term6543.getClass(), "realSize", -2924531382671518368L);
        setBooleanField(term6543, term6543.getClass(), "paxGNUSparse", true);
        setBooleanField(term6543, term6543.getClass(), "starSparse", false);
        setField(term6582, term6582.getClass(), "path", "wSQxaModmm");
        setField(term6582, term6582.getClass(), "status", enum125);
        setIntField(term6582, term6582.getClass(), "prefixLength", 906181092);
        setField(term6582, term6582.getClass(), "filePath", null);
        setField(term6543, term6543.getClass(), "file", term6582);
        Class<? extends Object> term30700 = Class.forName((String) "java.io.File$PathStatus");
        Field term30699 = ((Class) term30700).getDeclaredField((String) "CHECKED");
        ((Field) term30699).setAccessible(true);
        Object enum126 = ((Field) term30699).get((Object) null);
        term30494 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term30507 = newInstance(Class.forName("java.io.File"));
        setField(term30494, term30494.getClass(), "name", "");
        setBooleanField(term30494, term30494.getClass(), "preserveLeadingSlashes", false);
        setIntField(term30494, term30494.getClass(), "mode", 691577392);
        setLongField(term30494, term30494.getClass(), "userId", 8802866251294305945L);
        setLongField(term30494, term30494.getClass(), "groupId", 4513004407927379358L);
        setLongField(term30494, term30494.getClass(), "size", -7115418542247301000L);
        setLongField(term30494, term30494.getClass(), "modTime", 8034714140377562739L);
        setBooleanField(term30494, term30494.getClass(), "checkSumOK", true);
        setByteField(term30494, term30494.getClass(), "linkFlag", (byte) 42);
        setField(term30494, term30494.getClass(), "linkName", "");
        setField(term30494, term30494.getClass(), "magic", "ustar ");
        setField(term30494, term30494.getClass(), "version", "00");
        setField(term30494, term30494.getClass(), "userName", "root");
        setField(term30494, term30494.getClass(), "groupName", "");
        setIntField(term30494, term30494.getClass(), "devMajor", -893623680);
        setIntField(term30494, term30494.getClass(), "devMinor", -1963434938);
        setBooleanField(term30494, term30494.getClass(), "isExtended", true);
        setLongField(term30494, term30494.getClass(), "realSize", -2924531382671518368L);
        setBooleanField(term30494, term30494.getClass(), "paxGNUSparse", true);
        setBooleanField(term30494, term30494.getClass(), "starSparse", false);
        setField(term30507, term30507.getClass(), "path", "wSQxaModmm");
        setField(term30507, term30507.getClass(), "status", enum126);
        setIntField(term30507, term30507.getClass(), "prefixLength", 906181092);
        setField(term30507, term30507.getClass(), "filePath", null);
        setField(term30494, term30494.getClass(), "file", term30507);
        term30428 = newInstance(Class.forName("java.util.Date"));
        setLongField(term30428, term30428.getClass(), "fastTime", -8066275759801765576L);
        setField(term30428, term30428.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getModTime", argTypes, term6543, args);
        assertTrue(recursiveEquals(term6543, term30494));
        assertTrue(recursiveEquals(retValue, term30428));
    }

};


