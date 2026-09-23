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

public class TarArchiveEntry_setDevMinor_90853208119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8837;
     Object term8901;
     Object term34891;

    public TarArchiveEntry_setDevMinor_90853208119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34932 = Class.forName((String) "java.io.File$PathStatus");
        Field term34931 = ((Class) term34932).getDeclaredField((String) "INVALID");
        ((Field) term34931).setAccessible(true);
        Object enum145 = ((Field) term34931).get((Object) null);
        term8837 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term8876 = newInstance(Class.forName("java.io.File"));
        setField(term8837, term8837.getClass(), "name", "");
        setBooleanField(term8837, term8837.getClass(), "preserveLeadingSlashes", true);
        setIntField(term8837, term8837.getClass(), "mode", 1830648570);
        setLongField(term8837, term8837.getClass(), "userId", -433040798405298080L);
        setLongField(term8837, term8837.getClass(), "groupId", -1505191021111100819L);
        setLongField(term8837, term8837.getClass(), "size", -1000830646340880796L);
        setLongField(term8837, term8837.getClass(), "modTime", 5973526439563541711L);
        setBooleanField(term8837, term8837.getClass(), "checkSumOK", false);
        setByteField(term8837, term8837.getClass(), "linkFlag", (byte) -74);
        setField(term8837, term8837.getClass(), "linkName", "");
        setField(term8837, term8837.getClass(), "magic", "ustar ");
        setField(term8837, term8837.getClass(), "version", "00");
        setField(term8837, term8837.getClass(), "userName", "root");
        setField(term8837, term8837.getClass(), "groupName", "");
        setIntField(term8837, term8837.getClass(), "devMajor", -227365013);
        setIntField(term8837, term8837.getClass(), "devMinor", 11724947);
        setBooleanField(term8837, term8837.getClass(), "isExtended", false);
        setLongField(term8837, term8837.getClass(), "realSize", 5246058710498845622L);
        setBooleanField(term8837, term8837.getClass(), "paxGNUSparse", false);
        setBooleanField(term8837, term8837.getClass(), "starSparse", false);
        setField(term8876, term8876.getClass(), "path", "nGKItKLYNC");
        setField(term8876, term8876.getClass(), "status", enum145);
        setIntField(term8876, term8876.getClass(), "prefixLength", 1953277050);
        setField(term8876, term8876.getClass(), "filePath", null);
        setField(term8837, term8837.getClass(), "file", term8876);
        term8901 = new Integer(1283079251);
        Class<? extends Object> term35097 = Class.forName((String) "java.io.File$PathStatus");
        Field term35096 = ((Class) term35097).getDeclaredField((String) "INVALID");
        ((Field) term35096).setAccessible(true);
        Object enum146 = ((Field) term35096).get((Object) null);
        term34891 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term34904 = newInstance(Class.forName("java.io.File"));
        setField(term34891, term34891.getClass(), "name", "");
        setBooleanField(term34891, term34891.getClass(), "preserveLeadingSlashes", true);
        setIntField(term34891, term34891.getClass(), "mode", 1830648570);
        setLongField(term34891, term34891.getClass(), "userId", -433040798405298080L);
        setLongField(term34891, term34891.getClass(), "groupId", -1505191021111100819L);
        setLongField(term34891, term34891.getClass(), "size", -1000830646340880796L);
        setLongField(term34891, term34891.getClass(), "modTime", 5973526439563541711L);
        setBooleanField(term34891, term34891.getClass(), "checkSumOK", false);
        setByteField(term34891, term34891.getClass(), "linkFlag", (byte) -74);
        setField(term34891, term34891.getClass(), "linkName", "");
        setField(term34891, term34891.getClass(), "magic", "ustar ");
        setField(term34891, term34891.getClass(), "version", "00");
        setField(term34891, term34891.getClass(), "userName", "root");
        setField(term34891, term34891.getClass(), "groupName", "");
        setIntField(term34891, term34891.getClass(), "devMajor", -227365013);
        setIntField(term34891, term34891.getClass(), "devMinor", 1283079251);
        setBooleanField(term34891, term34891.getClass(), "isExtended", false);
        setLongField(term34891, term34891.getClass(), "realSize", 5246058710498845622L);
        setBooleanField(term34891, term34891.getClass(), "paxGNUSparse", false);
        setBooleanField(term34891, term34891.getClass(), "starSparse", false);
        setField(term34904, term34904.getClass(), "path", "nGKItKLYNC");
        setField(term34904, term34904.getClass(), "status", enum146);
        setIntField(term34904, term34904.getClass(), "prefixLength", 1953277050);
        setField(term34904, term34904.getClass(), "filePath", null);
        setField(term34891, term34891.getClass(), "file", term34904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8901;
        callMethod(klass, "setDevMinor", argTypes, term8837, args);
        assertTrue(recursiveEquals(term8837, term34891));
        assertTrue(recursiveEquals(term8901, 1283079251));
    }

};


