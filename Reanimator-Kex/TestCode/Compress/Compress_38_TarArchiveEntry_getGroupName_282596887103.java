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

public class TarArchiveEntry_getGroupName_282596887103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5095;
     Object term27863;

    public TarArchiveEntry_getGroupName_282596887103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27904 = Class.forName((String) "java.io.File$PathStatus");
        Field term27903 = ((Class) term27904).getDeclaredField((String) "CHECKED");
        ((Field) term27903).setAccessible(true);
        Object enum113 = ((Field) term27903).get((Object) null);
        term5095 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5134 = newInstance(Class.forName("java.io.File"));
        setField(term5095, term5095.getClass(), "name", "");
        setBooleanField(term5095, term5095.getClass(), "preserveLeadingSlashes", false);
        setIntField(term5095, term5095.getClass(), "mode", -556405712);
        setLongField(term5095, term5095.getClass(), "userId", 7276637106827860087L);
        setLongField(term5095, term5095.getClass(), "groupId", -3936701866695933852L);
        setLongField(term5095, term5095.getClass(), "size", 1215116475929634177L);
        setLongField(term5095, term5095.getClass(), "modTime", 1597484336218508869L);
        setBooleanField(term5095, term5095.getClass(), "checkSumOK", true);
        setByteField(term5095, term5095.getClass(), "linkFlag", (byte) 67);
        setField(term5095, term5095.getClass(), "linkName", "");
        setField(term5095, term5095.getClass(), "magic", "ustar ");
        setField(term5095, term5095.getClass(), "version", "00");
        setField(term5095, term5095.getClass(), "userName", "root");
        setField(term5095, term5095.getClass(), "groupName", "");
        setIntField(term5095, term5095.getClass(), "devMajor", -1772434990);
        setIntField(term5095, term5095.getClass(), "devMinor", -1845499264);
        setBooleanField(term5095, term5095.getClass(), "isExtended", true);
        setLongField(term5095, term5095.getClass(), "realSize", -685023850445639859L);
        setBooleanField(term5095, term5095.getClass(), "paxGNUSparse", true);
        setBooleanField(term5095, term5095.getClass(), "starSparse", false);
        setField(term5134, term5134.getClass(), "path", "dWRymuLBtr");
        setField(term5134, term5134.getClass(), "status", enum113);
        setIntField(term5134, term5134.getClass(), "prefixLength", -505439934);
        setField(term5134, term5134.getClass(), "filePath", null);
        setField(term5095, term5095.getClass(), "file", term5134);
        Class<? extends Object> term28069 = Class.forName((String) "java.io.File$PathStatus");
        Field term28068 = ((Class) term28069).getDeclaredField((String) "CHECKED");
        ((Field) term28068).setAccessible(true);
        Object enum114 = ((Field) term28068).get((Object) null);
        term27863 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term27876 = newInstance(Class.forName("java.io.File"));
        setField(term27863, term27863.getClass(), "name", "");
        setBooleanField(term27863, term27863.getClass(), "preserveLeadingSlashes", false);
        setIntField(term27863, term27863.getClass(), "mode", -556405712);
        setLongField(term27863, term27863.getClass(), "userId", 7276637106827860087L);
        setLongField(term27863, term27863.getClass(), "groupId", -3936701866695933852L);
        setLongField(term27863, term27863.getClass(), "size", 1215116475929634177L);
        setLongField(term27863, term27863.getClass(), "modTime", 1597484336218508869L);
        setBooleanField(term27863, term27863.getClass(), "checkSumOK", true);
        setByteField(term27863, term27863.getClass(), "linkFlag", (byte) 67);
        setField(term27863, term27863.getClass(), "linkName", "");
        setField(term27863, term27863.getClass(), "magic", "ustar ");
        setField(term27863, term27863.getClass(), "version", "00");
        setField(term27863, term27863.getClass(), "userName", "root");
        setField(term27863, term27863.getClass(), "groupName", "");
        setIntField(term27863, term27863.getClass(), "devMajor", -1772434990);
        setIntField(term27863, term27863.getClass(), "devMinor", -1845499264);
        setBooleanField(term27863, term27863.getClass(), "isExtended", true);
        setLongField(term27863, term27863.getClass(), "realSize", -685023850445639859L);
        setBooleanField(term27863, term27863.getClass(), "paxGNUSparse", true);
        setBooleanField(term27863, term27863.getClass(), "starSparse", false);
        setField(term27876, term27876.getClass(), "path", "dWRymuLBtr");
        setField(term27876, term27876.getClass(), "status", enum114);
        setIntField(term27876, term27876.getClass(), "prefixLength", -505439934);
        setField(term27876, term27876.getClass(), "filePath", null);
        setField(term27863, term27863.getClass(), "file", term27876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getGroupName", argTypes, term5095, args);
        assertTrue(recursiveEquals(term5095, term27863));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


