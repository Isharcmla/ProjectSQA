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
import java.lang.Integer;

public class TarArchiveEntry_setIds_1054176198105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5575;
     Object term5639;
     Object term5641;
     Object term28745;

    public TarArchiveEntry_setIds_1054176198105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28786 = Class.forName((String) "java.io.File$PathStatus");
        Field term28785 = ((Class) term28786).getDeclaredField((String) "INVALID");
        ((Field) term28785).setAccessible(true);
        Object enum117 = ((Field) term28785).get((Object) null);
        term5575 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5614 = newInstance(Class.forName("java.io.File"));
        setField(term5575, term5575.getClass(), "name", "");
        setBooleanField(term5575, term5575.getClass(), "preserveLeadingSlashes", true);
        setIntField(term5575, term5575.getClass(), "mode", -1263114719);
        setLongField(term5575, term5575.getClass(), "userId", -4822736661741380518L);
        setLongField(term5575, term5575.getClass(), "groupId", -5386201758403679145L);
        setLongField(term5575, term5575.getClass(), "size", -7268507582722666254L);
        setLongField(term5575, term5575.getClass(), "modTime", 5671808784468963649L);
        setBooleanField(term5575, term5575.getClass(), "checkSumOK", false);
        setByteField(term5575, term5575.getClass(), "linkFlag", (byte) -121);
        setField(term5575, term5575.getClass(), "linkName", "");
        setField(term5575, term5575.getClass(), "magic", "ustar ");
        setField(term5575, term5575.getClass(), "version", "00");
        setField(term5575, term5575.getClass(), "userName", "root");
        setField(term5575, term5575.getClass(), "groupName", "");
        setIntField(term5575, term5575.getClass(), "devMajor", -894662986);
        setIntField(term5575, term5575.getClass(), "devMinor", 304775596);
        setBooleanField(term5575, term5575.getClass(), "isExtended", false);
        setLongField(term5575, term5575.getClass(), "realSize", 2297097306706899827L);
        setBooleanField(term5575, term5575.getClass(), "paxGNUSparse", false);
        setBooleanField(term5575, term5575.getClass(), "starSparse", false);
        setField(term5614, term5614.getClass(), "path", "kuTXqwMtDB");
        setField(term5614, term5614.getClass(), "status", enum117);
        setIntField(term5614, term5614.getClass(), "prefixLength", -1347665717);
        setField(term5614, term5614.getClass(), "filePath", null);
        setField(term5575, term5575.getClass(), "file", term5614);
        term5639 = new Integer(-1888585309);
        term5641 = new Integer(683666002);
        Class<? extends Object> term28951 = Class.forName((String) "java.io.File$PathStatus");
        Field term28950 = ((Class) term28951).getDeclaredField((String) "INVALID");
        ((Field) term28950).setAccessible(true);
        Object enum118 = ((Field) term28950).get((Object) null);
        term28745 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term28758 = newInstance(Class.forName("java.io.File"));
        setField(term28745, term28745.getClass(), "name", "");
        setBooleanField(term28745, term28745.getClass(), "preserveLeadingSlashes", true);
        setIntField(term28745, term28745.getClass(), "mode", -1263114719);
        setLongField(term28745, term28745.getClass(), "userId", -1888585309L);
        setLongField(term28745, term28745.getClass(), "groupId", 683666002L);
        setLongField(term28745, term28745.getClass(), "size", -7268507582722666254L);
        setLongField(term28745, term28745.getClass(), "modTime", 5671808784468963649L);
        setBooleanField(term28745, term28745.getClass(), "checkSumOK", false);
        setByteField(term28745, term28745.getClass(), "linkFlag", (byte) -121);
        setField(term28745, term28745.getClass(), "linkName", "");
        setField(term28745, term28745.getClass(), "magic", "ustar ");
        setField(term28745, term28745.getClass(), "version", "00");
        setField(term28745, term28745.getClass(), "userName", "root");
        setField(term28745, term28745.getClass(), "groupName", "");
        setIntField(term28745, term28745.getClass(), "devMajor", -894662986);
        setIntField(term28745, term28745.getClass(), "devMinor", 304775596);
        setBooleanField(term28745, term28745.getClass(), "isExtended", false);
        setLongField(term28745, term28745.getClass(), "realSize", 2297097306706899827L);
        setBooleanField(term28745, term28745.getClass(), "paxGNUSparse", false);
        setBooleanField(term28745, term28745.getClass(), "starSparse", false);
        setField(term28758, term28758.getClass(), "path", "kuTXqwMtDB");
        setField(term28758, term28758.getClass(), "status", enum118);
        setIntField(term28758, term28758.getClass(), "prefixLength", -1347665717);
        setField(term28758, term28758.getClass(), "filePath", null);
        setField(term28745, term28745.getClass(), "file", term28758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5639;
        args[1] = term5641;
        callMethod(klass, "setIds", argTypes, term5575, args);
        assertTrue(recursiveEquals(term5575, term28745));
        assertTrue(recursiveEquals(term5639, -1888585309));
        assertTrue(recursiveEquals(term5641, 683666002));
    }

};


