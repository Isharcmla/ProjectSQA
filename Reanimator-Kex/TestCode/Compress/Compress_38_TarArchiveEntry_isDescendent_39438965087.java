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

public class TarArchiveEntry_isDescendent_39438965087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1280;
     Object term1344;
     Object term20872;
     Object term20891;

    public TarArchiveEntry_isDescendent_39438965087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20932 = Class.forName((String) "java.io.File$PathStatus");
        Field term20931 = ((Class) term20932).getDeclaredField((String) "CHECKED");
        ((Field) term20931).setAccessible(true);
        Object enum80 = ((Field) term20931).get((Object) null);
        term1280 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1319 = newInstance(Class.forName("java.io.File"));
        setField(term1280, term1280.getClass(), "name", "");
        setBooleanField(term1280, term1280.getClass(), "preserveLeadingSlashes", true);
        setIntField(term1280, term1280.getClass(), "mode", 1622346318);
        setLongField(term1280, term1280.getClass(), "userId", 8428634514691209827L);
        setLongField(term1280, term1280.getClass(), "groupId", -2585684163342970173L);
        setLongField(term1280, term1280.getClass(), "size", 8059786003080744426L);
        setLongField(term1280, term1280.getClass(), "modTime", -4365849114644724155L);
        setBooleanField(term1280, term1280.getClass(), "checkSumOK", true);
        setByteField(term1280, term1280.getClass(), "linkFlag", (byte) 49);
        setField(term1280, term1280.getClass(), "linkName", "");
        setField(term1280, term1280.getClass(), "magic", "ustar ");
        setField(term1280, term1280.getClass(), "version", "00");
        setField(term1280, term1280.getClass(), "userName", "root");
        setField(term1280, term1280.getClass(), "groupName", "");
        setIntField(term1280, term1280.getClass(), "devMajor", 1048535127);
        setIntField(term1280, term1280.getClass(), "devMinor", -655067527);
        setBooleanField(term1280, term1280.getClass(), "isExtended", true);
        setLongField(term1280, term1280.getClass(), "realSize", 2486810210675247493L);
        setBooleanField(term1280, term1280.getClass(), "paxGNUSparse", false);
        setBooleanField(term1280, term1280.getClass(), "starSparse", false);
        setField(term1319, term1319.getClass(), "path", "uuaPigETmJ");
        setField(term1319, term1319.getClass(), "status", enum80);
        setIntField(term1319, term1319.getClass(), "prefixLength", -6029667);
        setField(term1319, term1319.getClass(), "filePath", null);
        setField(term1280, term1280.getClass(), "file", term1319);
        term1344 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1383 = newInstance(Class.forName("java.io.File"));
        setField(term1344, term1344.getClass(), "name", "");
        setBooleanField(term1344, term1344.getClass(), "preserveLeadingSlashes", false);
        setIntField(term1344, term1344.getClass(), "mode", -2068769794);
        setLongField(term1344, term1344.getClass(), "userId", 7009926388951271268L);
        setLongField(term1344, term1344.getClass(), "groupId", -7672528020740371001L);
        setLongField(term1344, term1344.getClass(), "size", -4502405999831680926L);
        setLongField(term1344, term1344.getClass(), "modTime", 1967728129628047933L);
        setBooleanField(term1344, term1344.getClass(), "checkSumOK", true);
        setByteField(term1344, term1344.getClass(), "linkFlag", (byte) -54);
        setField(term1344, term1344.getClass(), "linkName", "");
        setField(term1344, term1344.getClass(), "magic", "ustar ");
        setField(term1344, term1344.getClass(), "version", "00");
        setField(term1344, term1344.getClass(), "userName", "root");
        setField(term1344, term1344.getClass(), "groupName", "");
        setIntField(term1344, term1344.getClass(), "devMajor", -117576464);
        setIntField(term1344, term1344.getClass(), "devMinor", -1007160944);
        setBooleanField(term1344, term1344.getClass(), "isExtended", true);
        setLongField(term1344, term1344.getClass(), "realSize", 2120084523938730454L);
        setBooleanField(term1344, term1344.getClass(), "paxGNUSparse", true);
        setBooleanField(term1344, term1344.getClass(), "starSparse", true);
        setField(term1383, term1383.getClass(), "path", "MxlszYVzRf");
        setField(term1383, term1383.getClass(), "status", enum80);
        setIntField(term1383, term1383.getClass(), "prefixLength", 1135664017);
        setField(term1383, term1383.getClass(), "filePath", null);
        setField(term1344, term1344.getClass(), "file", term1383);
        Class<? extends Object> term21118 = Class.forName((String) "java.io.File$PathStatus");
        Field term21117 = ((Class) term21118).getDeclaredField((String) "CHECKED");
        ((Field) term21117).setAccessible(true);
        Object enum81 = ((Field) term21117).get((Object) null);
        term20872 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term20885 = newInstance(Class.forName("java.io.File"));
        setField(term20872, term20872.getClass(), "name", "");
        setBooleanField(term20872, term20872.getClass(), "preserveLeadingSlashes", true);
        setIntField(term20872, term20872.getClass(), "mode", 1622346318);
        setLongField(term20872, term20872.getClass(), "userId", 8428634514691209827L);
        setLongField(term20872, term20872.getClass(), "groupId", -2585684163342970173L);
        setLongField(term20872, term20872.getClass(), "size", 8059786003080744426L);
        setLongField(term20872, term20872.getClass(), "modTime", -4365849114644724155L);
        setBooleanField(term20872, term20872.getClass(), "checkSumOK", true);
        setByteField(term20872, term20872.getClass(), "linkFlag", (byte) 49);
        setField(term20872, term20872.getClass(), "linkName", "");
        setField(term20872, term20872.getClass(), "magic", "ustar ");
        setField(term20872, term20872.getClass(), "version", "00");
        setField(term20872, term20872.getClass(), "userName", "root");
        setField(term20872, term20872.getClass(), "groupName", "");
        setIntField(term20872, term20872.getClass(), "devMajor", 1048535127);
        setIntField(term20872, term20872.getClass(), "devMinor", -655067527);
        setBooleanField(term20872, term20872.getClass(), "isExtended", true);
        setLongField(term20872, term20872.getClass(), "realSize", 2486810210675247493L);
        setBooleanField(term20872, term20872.getClass(), "paxGNUSparse", false);
        setBooleanField(term20872, term20872.getClass(), "starSparse", false);
        setField(term20885, term20885.getClass(), "path", "uuaPigETmJ");
        setField(term20885, term20885.getClass(), "status", enum81);
        setIntField(term20885, term20885.getClass(), "prefixLength", -6029667);
        setField(term20885, term20885.getClass(), "filePath", null);
        setField(term20872, term20872.getClass(), "file", term20885);
        Class<? extends Object> term21283 = Class.forName((String) "java.io.File$PathStatus");
        Field term21282 = ((Class) term21283).getDeclaredField((String) "CHECKED");
        ((Field) term21282).setAccessible(true);
        Object enum82 = ((Field) term21282).get((Object) null);
        term20891 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term20904 = newInstance(Class.forName("java.io.File"));
        setField(term20891, term20891.getClass(), "name", "");
        setBooleanField(term20891, term20891.getClass(), "preserveLeadingSlashes", false);
        setIntField(term20891, term20891.getClass(), "mode", -2068769794);
        setLongField(term20891, term20891.getClass(), "userId", 7009926388951271268L);
        setLongField(term20891, term20891.getClass(), "groupId", -7672528020740371001L);
        setLongField(term20891, term20891.getClass(), "size", -4502405999831680926L);
        setLongField(term20891, term20891.getClass(), "modTime", 1967728129628047933L);
        setBooleanField(term20891, term20891.getClass(), "checkSumOK", true);
        setByteField(term20891, term20891.getClass(), "linkFlag", (byte) -54);
        setField(term20891, term20891.getClass(), "linkName", "");
        setField(term20891, term20891.getClass(), "magic", "ustar ");
        setField(term20891, term20891.getClass(), "version", "00");
        setField(term20891, term20891.getClass(), "userName", "root");
        setField(term20891, term20891.getClass(), "groupName", "");
        setIntField(term20891, term20891.getClass(), "devMajor", -117576464);
        setIntField(term20891, term20891.getClass(), "devMinor", -1007160944);
        setBooleanField(term20891, term20891.getClass(), "isExtended", true);
        setLongField(term20891, term20891.getClass(), "realSize", 2120084523938730454L);
        setBooleanField(term20891, term20891.getClass(), "paxGNUSparse", true);
        setBooleanField(term20891, term20891.getClass(), "starSparse", true);
        setField(term20904, term20904.getClass(), "path", "MxlszYVzRf");
        setField(term20904, term20904.getClass(), "status", enum82);
        setIntField(term20904, term20904.getClass(), "prefixLength", 1135664017);
        setField(term20904, term20904.getClass(), "filePath", null);
        setField(term20891, term20891.getClass(), "file", term20904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term1344;
        callMethod(klass, "isDescendent", argTypes, term1280, args);
        assertTrue(recursiveEquals(term1280, term20872));
        assertTrue(recursiveEquals(term1344, term20891));
    }

};


