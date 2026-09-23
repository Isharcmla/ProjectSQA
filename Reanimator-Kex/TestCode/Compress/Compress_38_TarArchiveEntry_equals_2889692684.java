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

public class TarArchiveEntry_equals_2889692684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term517;
     Object term581;
     Object term19364;
     Object term19383;

    public TarArchiveEntry_equals_2889692684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19424 = Class.forName((String) "java.io.File$PathStatus");
        Field term19423 = ((Class) term19424).getDeclaredField((String) "INVALID");
        ((Field) term19423).setAccessible(true);
        Object enum73 = ((Field) term19423).get((Object) null);
        term517 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term556 = newInstance(Class.forName("java.io.File"));
        setField(term517, term517.getClass(), "name", "");
        setBooleanField(term517, term517.getClass(), "preserveLeadingSlashes", false);
        setIntField(term517, term517.getClass(), "mode", 1484323161);
        setLongField(term517, term517.getClass(), "userId", 2442117782898005296L);
        setLongField(term517, term517.getClass(), "groupId", 6375119433582206027L);
        setLongField(term517, term517.getClass(), "size", -8257434502486459194L);
        setLongField(term517, term517.getClass(), "modTime", -8400487765614892086L);
        setBooleanField(term517, term517.getClass(), "checkSumOK", false);
        setByteField(term517, term517.getClass(), "linkFlag", (byte) -66);
        setField(term517, term517.getClass(), "linkName", "");
        setField(term517, term517.getClass(), "magic", "ustar ");
        setField(term517, term517.getClass(), "version", "00");
        setField(term517, term517.getClass(), "userName", "root");
        setField(term517, term517.getClass(), "groupName", "");
        setIntField(term517, term517.getClass(), "devMajor", 391863371);
        setIntField(term517, term517.getClass(), "devMinor", -1922583790);
        setBooleanField(term517, term517.getClass(), "isExtended", true);
        setLongField(term517, term517.getClass(), "realSize", 5270370404989704783L);
        setBooleanField(term517, term517.getClass(), "paxGNUSparse", true);
        setBooleanField(term517, term517.getClass(), "starSparse", true);
        setField(term556, term556.getClass(), "path", "MjGYSRKTNF");
        setField(term556, term556.getClass(), "status", enum73);
        setIntField(term556, term556.getClass(), "prefixLength", -616727354);
        setField(term556, term556.getClass(), "filePath", null);
        setField(term517, term517.getClass(), "file", term556);
        term581 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term620 = newInstance(Class.forName("java.io.File"));
        setField(term581, term581.getClass(), "name", "");
        setBooleanField(term581, term581.getClass(), "preserveLeadingSlashes", true);
        setIntField(term581, term581.getClass(), "mode", -1955890973);
        setLongField(term581, term581.getClass(), "userId", 7411271909051562686L);
        setLongField(term581, term581.getClass(), "groupId", 4872422362414183754L);
        setLongField(term581, term581.getClass(), "size", 6811161968424632369L);
        setLongField(term581, term581.getClass(), "modTime", -7237588299778557629L);
        setBooleanField(term581, term581.getClass(), "checkSumOK", false);
        setByteField(term581, term581.getClass(), "linkFlag", (byte) 83);
        setField(term581, term581.getClass(), "linkName", "");
        setField(term581, term581.getClass(), "magic", "ustar ");
        setField(term581, term581.getClass(), "version", "00");
        setField(term581, term581.getClass(), "userName", "root");
        setField(term581, term581.getClass(), "groupName", "");
        setIntField(term581, term581.getClass(), "devMajor", -2038273078);
        setIntField(term581, term581.getClass(), "devMinor", 1227103734);
        setBooleanField(term581, term581.getClass(), "isExtended", true);
        setLongField(term581, term581.getClass(), "realSize", 6967924379644551255L);
        setBooleanField(term581, term581.getClass(), "paxGNUSparse", false);
        setBooleanField(term581, term581.getClass(), "starSparse", true);
        setField(term620, term620.getClass(), "path", "hRNSzYYIrc");
        setField(term620, term620.getClass(), "status", enum73);
        setIntField(term620, term620.getClass(), "prefixLength", -1339778481);
        setField(term620, term620.getClass(), "filePath", null);
        setField(term581, term581.getClass(), "file", term620);
        Class<? extends Object> term19613 = Class.forName((String) "java.io.File$PathStatus");
        Field term19612 = ((Class) term19613).getDeclaredField((String) "INVALID");
        ((Field) term19612).setAccessible(true);
        Object enum74 = ((Field) term19612).get((Object) null);
        term19364 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term19377 = newInstance(Class.forName("java.io.File"));
        setField(term19364, term19364.getClass(), "name", "");
        setBooleanField(term19364, term19364.getClass(), "preserveLeadingSlashes", false);
        setIntField(term19364, term19364.getClass(), "mode", 1484323161);
        setLongField(term19364, term19364.getClass(), "userId", 2442117782898005296L);
        setLongField(term19364, term19364.getClass(), "groupId", 6375119433582206027L);
        setLongField(term19364, term19364.getClass(), "size", -8257434502486459194L);
        setLongField(term19364, term19364.getClass(), "modTime", -8400487765614892086L);
        setBooleanField(term19364, term19364.getClass(), "checkSumOK", false);
        setByteField(term19364, term19364.getClass(), "linkFlag", (byte) -66);
        setField(term19364, term19364.getClass(), "linkName", "");
        setField(term19364, term19364.getClass(), "magic", "ustar ");
        setField(term19364, term19364.getClass(), "version", "00");
        setField(term19364, term19364.getClass(), "userName", "root");
        setField(term19364, term19364.getClass(), "groupName", "");
        setIntField(term19364, term19364.getClass(), "devMajor", 391863371);
        setIntField(term19364, term19364.getClass(), "devMinor", -1922583790);
        setBooleanField(term19364, term19364.getClass(), "isExtended", true);
        setLongField(term19364, term19364.getClass(), "realSize", 5270370404989704783L);
        setBooleanField(term19364, term19364.getClass(), "paxGNUSparse", true);
        setBooleanField(term19364, term19364.getClass(), "starSparse", true);
        setField(term19377, term19377.getClass(), "path", "MjGYSRKTNF");
        setField(term19377, term19377.getClass(), "status", enum74);
        setIntField(term19377, term19377.getClass(), "prefixLength", -616727354);
        setField(term19377, term19377.getClass(), "filePath", null);
        setField(term19364, term19364.getClass(), "file", term19377);
        Class<? extends Object> term19778 = Class.forName((String) "java.io.File$PathStatus");
        Field term19777 = ((Class) term19778).getDeclaredField((String) "INVALID");
        ((Field) term19777).setAccessible(true);
        Object enum75 = ((Field) term19777).get((Object) null);
        term19383 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term19396 = newInstance(Class.forName("java.io.File"));
        setField(term19383, term19383.getClass(), "name", "");
        setBooleanField(term19383, term19383.getClass(), "preserveLeadingSlashes", true);
        setIntField(term19383, term19383.getClass(), "mode", -1955890973);
        setLongField(term19383, term19383.getClass(), "userId", 7411271909051562686L);
        setLongField(term19383, term19383.getClass(), "groupId", 4872422362414183754L);
        setLongField(term19383, term19383.getClass(), "size", 6811161968424632369L);
        setLongField(term19383, term19383.getClass(), "modTime", -7237588299778557629L);
        setBooleanField(term19383, term19383.getClass(), "checkSumOK", false);
        setByteField(term19383, term19383.getClass(), "linkFlag", (byte) 83);
        setField(term19383, term19383.getClass(), "linkName", "");
        setField(term19383, term19383.getClass(), "magic", "ustar ");
        setField(term19383, term19383.getClass(), "version", "00");
        setField(term19383, term19383.getClass(), "userName", "root");
        setField(term19383, term19383.getClass(), "groupName", "");
        setIntField(term19383, term19383.getClass(), "devMajor", -2038273078);
        setIntField(term19383, term19383.getClass(), "devMinor", 1227103734);
        setBooleanField(term19383, term19383.getClass(), "isExtended", true);
        setLongField(term19383, term19383.getClass(), "realSize", 6967924379644551255L);
        setBooleanField(term19383, term19383.getClass(), "paxGNUSparse", false);
        setBooleanField(term19383, term19383.getClass(), "starSparse", true);
        setField(term19396, term19396.getClass(), "path", "hRNSzYYIrc");
        setField(term19396, term19396.getClass(), "status", enum75);
        setIntField(term19396, term19396.getClass(), "prefixLength", -1339778481);
        setField(term19396, term19396.getClass(), "filePath", null);
        setField(term19383, term19383.getClass(), "file", term19396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term581;
        callMethod(klass, "equals", argTypes, term517, args);
        assertTrue(recursiveEquals(term517, term19364));
        assertTrue(recursiveEquals(term581, term19383));
    }

};


