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

public class TarArchiveEntry_setUserName_693600967102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4844;
     Object term27421;

    public TarArchiveEntry_setUserName_693600967102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27464 = Class.forName((String) "java.io.File$PathStatus");
        Field term27463 = ((Class) term27464).getDeclaredField((String) "CHECKED");
        ((Field) term27463).setAccessible(true);
        Object enum111 = ((Field) term27463).get((Object) null);
        term4844 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4883 = newInstance(Class.forName("java.io.File"));
        setField(term4844, term4844.getClass(), "name", "");
        setBooleanField(term4844, term4844.getClass(), "preserveLeadingSlashes", false);
        setIntField(term4844, term4844.getClass(), "mode", 1090617576);
        setLongField(term4844, term4844.getClass(), "userId", -8033714905181142681L);
        setLongField(term4844, term4844.getClass(), "groupId", -9040825890007374809L);
        setLongField(term4844, term4844.getClass(), "size", 1368340889161782793L);
        setLongField(term4844, term4844.getClass(), "modTime", -5786861555969446503L);
        setBooleanField(term4844, term4844.getClass(), "checkSumOK", false);
        setByteField(term4844, term4844.getClass(), "linkFlag", (byte) 98);
        setField(term4844, term4844.getClass(), "linkName", "");
        setField(term4844, term4844.getClass(), "magic", "ustar ");
        setField(term4844, term4844.getClass(), "version", "00");
        setField(term4844, term4844.getClass(), "userName", "root");
        setField(term4844, term4844.getClass(), "groupName", "");
        setIntField(term4844, term4844.getClass(), "devMajor", -1547384488);
        setIntField(term4844, term4844.getClass(), "devMinor", 1442160736);
        setBooleanField(term4844, term4844.getClass(), "isExtended", true);
        setLongField(term4844, term4844.getClass(), "realSize", 2354625302846375590L);
        setBooleanField(term4844, term4844.getClass(), "paxGNUSparse", true);
        setBooleanField(term4844, term4844.getClass(), "starSparse", true);
        setField(term4883, term4883.getClass(), "path", "TEParAifyi");
        setField(term4883, term4883.getClass(), "status", enum111);
        setIntField(term4883, term4883.getClass(), "prefixLength", 1114000454);
        setField(term4883, term4883.getClass(), "filePath", null);
        setField(term4844, term4844.getClass(), "file", term4883);
        Class<? extends Object> term27645 = Class.forName((String) "java.io.File$PathStatus");
        Field term27644 = ((Class) term27645).getDeclaredField((String) "CHECKED");
        ((Field) term27644).setAccessible(true);
        Object enum112 = ((Field) term27644).get((Object) null);
        term27421 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term27434 = newInstance(Class.forName("java.io.File"));
        setField(term27421, term27421.getClass(), "name", "");
        setBooleanField(term27421, term27421.getClass(), "preserveLeadingSlashes", false);
        setIntField(term27421, term27421.getClass(), "mode", 1090617576);
        setLongField(term27421, term27421.getClass(), "userId", -8033714905181142681L);
        setLongField(term27421, term27421.getClass(), "groupId", -9040825890007374809L);
        setLongField(term27421, term27421.getClass(), "size", 1368340889161782793L);
        setLongField(term27421, term27421.getClass(), "modTime", -5786861555969446503L);
        setBooleanField(term27421, term27421.getClass(), "checkSumOK", false);
        setByteField(term27421, term27421.getClass(), "linkFlag", (byte) 98);
        setField(term27421, term27421.getClass(), "linkName", "");
        setField(term27421, term27421.getClass(), "magic", "ustar ");
        setField(term27421, term27421.getClass(), "version", "00");
        setField(term27421, term27421.getClass(), "userName", "OWDIEULEFu");
        setField(term27421, term27421.getClass(), "groupName", "");
        setIntField(term27421, term27421.getClass(), "devMajor", -1547384488);
        setIntField(term27421, term27421.getClass(), "devMinor", 1442160736);
        setBooleanField(term27421, term27421.getClass(), "isExtended", true);
        setLongField(term27421, term27421.getClass(), "realSize", 2354625302846375590L);
        setBooleanField(term27421, term27421.getClass(), "paxGNUSparse", true);
        setBooleanField(term27421, term27421.getClass(), "starSparse", true);
        setField(term27434, term27434.getClass(), "path", "TEParAifyi");
        setField(term27434, term27434.getClass(), "status", enum112);
        setIntField(term27434, term27434.getClass(), "prefixLength", 1114000454);
        setField(term27434, term27434.getClass(), "filePath", null);
        setField(term27421, term27421.getClass(), "file", term27434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OWDIEULEFu";
        callMethod(klass, "setUserName", argTypes, term4844, args);
        assertTrue(recursiveEquals(term4844, term27421));
    }

};


