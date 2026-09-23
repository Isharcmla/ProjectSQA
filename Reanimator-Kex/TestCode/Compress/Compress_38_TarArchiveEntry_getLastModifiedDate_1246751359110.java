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

public class TarArchiveEntry_getLastModifiedDate_1246751359110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6772;
     Object term30910;
     Object term30908;

    public TarArchiveEntry_getLastModifiedDate_1246751359110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30951 = Class.forName((String) "java.io.File$PathStatus");
        Field term30950 = ((Class) term30951).getDeclaredField((String) "CHECKED");
        ((Field) term30950).setAccessible(true);
        Object enum127 = ((Field) term30950).get((Object) null);
        term6772 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term6811 = newInstance(Class.forName("java.io.File"));
        setField(term6772, term6772.getClass(), "name", "");
        setBooleanField(term6772, term6772.getClass(), "preserveLeadingSlashes", true);
        setIntField(term6772, term6772.getClass(), "mode", 1045657203);
        setLongField(term6772, term6772.getClass(), "userId", -3948863953565024517L);
        setLongField(term6772, term6772.getClass(), "groupId", -6587807377747738663L);
        setLongField(term6772, term6772.getClass(), "size", -6301101997917060727L);
        setLongField(term6772, term6772.getClass(), "modTime", 8166095254618543564L);
        setBooleanField(term6772, term6772.getClass(), "checkSumOK", false);
        setByteField(term6772, term6772.getClass(), "linkFlag", (byte) 72);
        setField(term6772, term6772.getClass(), "linkName", "");
        setField(term6772, term6772.getClass(), "magic", "ustar ");
        setField(term6772, term6772.getClass(), "version", "00");
        setField(term6772, term6772.getClass(), "userName", "root");
        setField(term6772, term6772.getClass(), "groupName", "");
        setIntField(term6772, term6772.getClass(), "devMajor", 1386130016);
        setIntField(term6772, term6772.getClass(), "devMinor", 1072005683);
        setBooleanField(term6772, term6772.getClass(), "isExtended", false);
        setLongField(term6772, term6772.getClass(), "realSize", -4598158870068953328L);
        setBooleanField(term6772, term6772.getClass(), "paxGNUSparse", true);
        setBooleanField(term6772, term6772.getClass(), "starSparse", false);
        setField(term6811, term6811.getClass(), "path", "UlajhuVLaP");
        setField(term6811, term6811.getClass(), "status", enum127);
        setIntField(term6811, term6811.getClass(), "prefixLength", 1861318859);
        setField(term6811, term6811.getClass(), "filePath", null);
        setField(term6772, term6772.getClass(), "file", term6811);
        Class<? extends Object> term31116 = Class.forName((String) "java.io.File$PathStatus");
        Field term31115 = ((Class) term31116).getDeclaredField((String) "CHECKED");
        ((Field) term31115).setAccessible(true);
        Object enum128 = ((Field) term31115).get((Object) null);
        term30910 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term30923 = newInstance(Class.forName("java.io.File"));
        setField(term30910, term30910.getClass(), "name", "");
        setBooleanField(term30910, term30910.getClass(), "preserveLeadingSlashes", true);
        setIntField(term30910, term30910.getClass(), "mode", 1045657203);
        setLongField(term30910, term30910.getClass(), "userId", -3948863953565024517L);
        setLongField(term30910, term30910.getClass(), "groupId", -6587807377747738663L);
        setLongField(term30910, term30910.getClass(), "size", -6301101997917060727L);
        setLongField(term30910, term30910.getClass(), "modTime", 8166095254618543564L);
        setBooleanField(term30910, term30910.getClass(), "checkSumOK", false);
        setByteField(term30910, term30910.getClass(), "linkFlag", (byte) 72);
        setField(term30910, term30910.getClass(), "linkName", "");
        setField(term30910, term30910.getClass(), "magic", "ustar ");
        setField(term30910, term30910.getClass(), "version", "00");
        setField(term30910, term30910.getClass(), "userName", "root");
        setField(term30910, term30910.getClass(), "groupName", "");
        setIntField(term30910, term30910.getClass(), "devMajor", 1386130016);
        setIntField(term30910, term30910.getClass(), "devMinor", 1072005683);
        setBooleanField(term30910, term30910.getClass(), "isExtended", false);
        setLongField(term30910, term30910.getClass(), "realSize", -4598158870068953328L);
        setBooleanField(term30910, term30910.getClass(), "paxGNUSparse", true);
        setBooleanField(term30910, term30910.getClass(), "starSparse", false);
        setField(term30923, term30923.getClass(), "path", "UlajhuVLaP");
        setField(term30923, term30923.getClass(), "status", enum128);
        setIntField(term30923, term30923.getClass(), "prefixLength", 1861318859);
        setField(term30923, term30923.getClass(), "filePath", null);
        setField(term30910, term30910.getClass(), "file", term30923);
        term30908 = newInstance(Class.forName("java.util.Date"));
        setLongField(term30908, term30908.getClass(), "fastTime", -5812370034787801888L);
        setField(term30908, term30908.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLastModifiedDate", argTypes, term6772, args);
        assertTrue(recursiveEquals(term6772, term30910));
        assertTrue(recursiveEquals(retValue, term30908));
    }

};


