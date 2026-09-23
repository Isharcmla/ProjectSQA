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
import java.lang.Long;

public class TarArchiveEntry_setModTime_885976275107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6081;
     Object term6145;
     Object term29736;

    public TarArchiveEntry_setModTime_885976275107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29808 = Class.forName((String) "java.io.File$PathStatus");
        Field term29807 = ((Class) term29808).getDeclaredField((String) "INVALID");
        ((Field) term29807).setAccessible(true);
        Object enum121 = ((Field) term29807).get((Object) null);
        term6081 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term6120 = newInstance(Class.forName("java.io.File"));
        setField(term6081, term6081.getClass(), "name", "");
        setBooleanField(term6081, term6081.getClass(), "preserveLeadingSlashes", false);
        setIntField(term6081, term6081.getClass(), "mode", 339854490);
        setLongField(term6081, term6081.getClass(), "userId", -1214968196781083707L);
        setLongField(term6081, term6081.getClass(), "groupId", -1804015692891701666L);
        setLongField(term6081, term6081.getClass(), "size", -6432617521836576658L);
        setLongField(term6081, term6081.getClass(), "modTime", -2255965562447970862L);
        setBooleanField(term6081, term6081.getClass(), "checkSumOK", false);
        setByteField(term6081, term6081.getClass(), "linkFlag", (byte) 71);
        setField(term6081, term6081.getClass(), "linkName", "");
        setField(term6081, term6081.getClass(), "magic", "ustar ");
        setField(term6081, term6081.getClass(), "version", "00");
        setField(term6081, term6081.getClass(), "userName", "root");
        setField(term6081, term6081.getClass(), "groupName", "");
        setIntField(term6081, term6081.getClass(), "devMajor", -615654495);
        setIntField(term6081, term6081.getClass(), "devMinor", -1476117762);
        setBooleanField(term6081, term6081.getClass(), "isExtended", true);
        setLongField(term6081, term6081.getClass(), "realSize", 148047808219672941L);
        setBooleanField(term6081, term6081.getClass(), "paxGNUSparse", true);
        setBooleanField(term6081, term6081.getClass(), "starSparse", false);
        setField(term6120, term6120.getClass(), "path", "nyiiPDVjAc");
        setField(term6120, term6120.getClass(), "status", enum121);
        setIntField(term6120, term6120.getClass(), "prefixLength", -341962980);
        setField(term6120, term6120.getClass(), "filePath", null);
        setField(term6081, term6081.getClass(), "file", term6120);
        term6145 = new Long(7489064039921396098L);
        Class<? extends Object> term30185 = Class.forName((String) "java.io.File$PathStatus");
        Field term30184 = ((Class) term30185).getDeclaredField((String) "INVALID");
        ((Field) term30184).setAccessible(true);
        Object enum124 = ((Field) term30184).get((Object) null);
        term29736 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term29749 = newInstance(Class.forName("java.io.File"));
        setField(term29736, term29736.getClass(), "name", "");
        setBooleanField(term29736, term29736.getClass(), "preserveLeadingSlashes", false);
        setIntField(term29736, term29736.getClass(), "mode", 339854490);
        setLongField(term29736, term29736.getClass(), "userId", -1214968196781083707L);
        setLongField(term29736, term29736.getClass(), "groupId", -1804015692891701666L);
        setLongField(term29736, term29736.getClass(), "size", -6432617521836576658L);
        setLongField(term29736, term29736.getClass(), "modTime", 7489064039921396L);
        setBooleanField(term29736, term29736.getClass(), "checkSumOK", false);
        setByteField(term29736, term29736.getClass(), "linkFlag", (byte) 71);
        setField(term29736, term29736.getClass(), "linkName", "");
        setField(term29736, term29736.getClass(), "magic", "ustar ");
        setField(term29736, term29736.getClass(), "version", "00");
        setField(term29736, term29736.getClass(), "userName", "root");
        setField(term29736, term29736.getClass(), "groupName", "");
        setIntField(term29736, term29736.getClass(), "devMajor", -615654495);
        setIntField(term29736, term29736.getClass(), "devMinor", -1476117762);
        setBooleanField(term29736, term29736.getClass(), "isExtended", true);
        setLongField(term29736, term29736.getClass(), "realSize", 148047808219672941L);
        setBooleanField(term29736, term29736.getClass(), "paxGNUSparse", true);
        setBooleanField(term29736, term29736.getClass(), "starSparse", false);
        setField(term29749, term29749.getClass(), "path", "nyiiPDVjAc");
        setField(term29749, term29749.getClass(), "status", enum124);
        setIntField(term29749, term29749.getClass(), "prefixLength", -341962980);
        setField(term29749, term29749.getClass(), "filePath", null);
        setField(term29736, term29736.getClass(), "file", term29749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6145;
        callMethod(klass, "setModTime", argTypes, term6081, args);
        assertTrue(recursiveEquals(term6081, term29736));
        assertTrue(recursiveEquals(term6145, 7489064039921396098L));
    }

};


