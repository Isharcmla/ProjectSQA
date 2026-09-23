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

public class TarArchiveEntry_setModTime_1150485701108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6312;
     Object term6376;
     Object term29755;
     Object term29774;

    public TarArchiveEntry_setModTime_1150485701108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29855 = Class.forName((String) "java.io.File$PathStatus");
        Field term29854 = ((Class) term29855).getDeclaredField((String) "CHECKED");
        ((Field) term29854).setAccessible(true);
        Object enum122 = ((Field) term29854).get((Object) null);
        term6312 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term6351 = newInstance(Class.forName("java.io.File"));
        setField(term6312, term6312.getClass(), "name", "");
        setBooleanField(term6312, term6312.getClass(), "preserveLeadingSlashes", false);
        setIntField(term6312, term6312.getClass(), "mode", 1532716628);
        setLongField(term6312, term6312.getClass(), "userId", 6843866297465638866L);
        setLongField(term6312, term6312.getClass(), "groupId", -4023935540989049732L);
        setLongField(term6312, term6312.getClass(), "size", 855932984568615096L);
        setLongField(term6312, term6312.getClass(), "modTime", -1616722610139554082L);
        setBooleanField(term6312, term6312.getClass(), "checkSumOK", true);
        setByteField(term6312, term6312.getClass(), "linkFlag", (byte) 80);
        setField(term6312, term6312.getClass(), "linkName", "");
        setField(term6312, term6312.getClass(), "magic", "ustar ");
        setField(term6312, term6312.getClass(), "version", "00");
        setField(term6312, term6312.getClass(), "userName", "root");
        setField(term6312, term6312.getClass(), "groupName", "");
        setIntField(term6312, term6312.getClass(), "devMajor", -1801760683);
        setIntField(term6312, term6312.getClass(), "devMinor", 1141317871);
        setBooleanField(term6312, term6312.getClass(), "isExtended", false);
        setLongField(term6312, term6312.getClass(), "realSize", 7495904023107549024L);
        setBooleanField(term6312, term6312.getClass(), "paxGNUSparse", true);
        setBooleanField(term6312, term6312.getClass(), "starSparse", false);
        setField(term6351, term6351.getClass(), "path", "aKnKipADSo");
        setField(term6351, term6351.getClass(), "status", enum122);
        setIntField(term6351, term6351.getClass(), "prefixLength", 890669485);
        setField(term6351, term6351.getClass(), "filePath", null);
        setField(term6312, term6312.getClass(), "file", term6351);
        term6376 = newInstance(Class.forName("java.util.Date"));
        setLongField(term6376, term6376.getClass(), "fastTime", 1345889412244L);
        setField(term6376, term6376.getClass(), "cdate", null);
        Class<? extends Object> term30126 = Class.forName((String) "java.io.File$PathStatus");
        Field term30125 = ((Class) term30126).getDeclaredField((String) "CHECKED");
        ((Field) term30125).setAccessible(true);
        Object enum123 = ((Field) term30125).get((Object) null);
        term29755 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term29768 = newInstance(Class.forName("java.io.File"));
        setField(term29755, term29755.getClass(), "name", "");
        setBooleanField(term29755, term29755.getClass(), "preserveLeadingSlashes", false);
        setIntField(term29755, term29755.getClass(), "mode", 1532716628);
        setLongField(term29755, term29755.getClass(), "userId", 6843866297465638866L);
        setLongField(term29755, term29755.getClass(), "groupId", -4023935540989049732L);
        setLongField(term29755, term29755.getClass(), "size", 855932984568615096L);
        setLongField(term29755, term29755.getClass(), "modTime", 1345889412L);
        setBooleanField(term29755, term29755.getClass(), "checkSumOK", true);
        setByteField(term29755, term29755.getClass(), "linkFlag", (byte) 80);
        setField(term29755, term29755.getClass(), "linkName", "");
        setField(term29755, term29755.getClass(), "magic", "ustar ");
        setField(term29755, term29755.getClass(), "version", "00");
        setField(term29755, term29755.getClass(), "userName", "root");
        setField(term29755, term29755.getClass(), "groupName", "");
        setIntField(term29755, term29755.getClass(), "devMajor", -1801760683);
        setIntField(term29755, term29755.getClass(), "devMinor", 1141317871);
        setBooleanField(term29755, term29755.getClass(), "isExtended", false);
        setLongField(term29755, term29755.getClass(), "realSize", 7495904023107549024L);
        setBooleanField(term29755, term29755.getClass(), "paxGNUSparse", true);
        setBooleanField(term29755, term29755.getClass(), "starSparse", false);
        setField(term29768, term29768.getClass(), "path", "aKnKipADSo");
        setField(term29768, term29768.getClass(), "status", enum123);
        setIntField(term29768, term29768.getClass(), "prefixLength", 890669485);
        setField(term29768, term29768.getClass(), "filePath", null);
        setField(term29755, term29755.getClass(), "file", term29768);
        term29774 = newInstance(Class.forName("java.util.Date"));
        setLongField(term29774, term29774.getClass(), "fastTime", 1345889412244L);
        setField(term29774, term29774.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term6376;
        callMethod(klass, "setModTime", argTypes, term6312, args);
        assertTrue(recursiveEquals(term6312, term29755));
        assertTrue(recursiveEquals(term6376, term29774));
    }

};


