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

public class TarArchiveEntry_getFile_1842676826112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7230;
     Object term31735;
     Object term31671;

    public TarArchiveEntry_getFile_1842676826112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31776 = Class.forName((String) "java.io.File$PathStatus");
        Field term31775 = ((Class) term31776).getDeclaredField((String) "CHECKED");
        ((Field) term31775).setAccessible(true);
        Object enum131 = ((Field) term31775).get((Object) null);
        term7230 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term7269 = newInstance(Class.forName("java.io.File"));
        setField(term7230, term7230.getClass(), "name", "");
        setBooleanField(term7230, term7230.getClass(), "preserveLeadingSlashes", true);
        setIntField(term7230, term7230.getClass(), "mode", 1107176718);
        setLongField(term7230, term7230.getClass(), "userId", 3452833434644634217L);
        setLongField(term7230, term7230.getClass(), "groupId", -8603648071751666348L);
        setLongField(term7230, term7230.getClass(), "size", -7884871963229073324L);
        setLongField(term7230, term7230.getClass(), "modTime", -8649738738252714180L);
        setBooleanField(term7230, term7230.getClass(), "checkSumOK", true);
        setByteField(term7230, term7230.getClass(), "linkFlag", (byte) 99);
        setField(term7230, term7230.getClass(), "linkName", "");
        setField(term7230, term7230.getClass(), "magic", "ustar ");
        setField(term7230, term7230.getClass(), "version", "00");
        setField(term7230, term7230.getClass(), "userName", "root");
        setField(term7230, term7230.getClass(), "groupName", "");
        setIntField(term7230, term7230.getClass(), "devMajor", 480137250);
        setIntField(term7230, term7230.getClass(), "devMinor", -341152642);
        setBooleanField(term7230, term7230.getClass(), "isExtended", false);
        setLongField(term7230, term7230.getClass(), "realSize", -7278883608542636188L);
        setBooleanField(term7230, term7230.getClass(), "paxGNUSparse", false);
        setBooleanField(term7230, term7230.getClass(), "starSparse", false);
        setField(term7269, term7269.getClass(), "path", "hxCBltsObl");
        setField(term7269, term7269.getClass(), "status", enum131);
        setIntField(term7269, term7269.getClass(), "prefixLength", -2015854073);
        setField(term7269, term7269.getClass(), "filePath", null);
        setField(term7230, term7230.getClass(), "file", term7269);
        Class<? extends Object> term31941 = Class.forName((String) "java.io.File$PathStatus");
        Field term31940 = ((Class) term31941).getDeclaredField((String) "CHECKED");
        ((Field) term31940).setAccessible(true);
        Object enum132 = ((Field) term31940).get((Object) null);
        term31735 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term31748 = newInstance(Class.forName("java.io.File"));
        setField(term31735, term31735.getClass(), "name", "");
        setBooleanField(term31735, term31735.getClass(), "preserveLeadingSlashes", true);
        setIntField(term31735, term31735.getClass(), "mode", 1107176718);
        setLongField(term31735, term31735.getClass(), "userId", 3452833434644634217L);
        setLongField(term31735, term31735.getClass(), "groupId", -8603648071751666348L);
        setLongField(term31735, term31735.getClass(), "size", -7884871963229073324L);
        setLongField(term31735, term31735.getClass(), "modTime", -8649738738252714180L);
        setBooleanField(term31735, term31735.getClass(), "checkSumOK", true);
        setByteField(term31735, term31735.getClass(), "linkFlag", (byte) 99);
        setField(term31735, term31735.getClass(), "linkName", "");
        setField(term31735, term31735.getClass(), "magic", "ustar ");
        setField(term31735, term31735.getClass(), "version", "00");
        setField(term31735, term31735.getClass(), "userName", "root");
        setField(term31735, term31735.getClass(), "groupName", "");
        setIntField(term31735, term31735.getClass(), "devMajor", 480137250);
        setIntField(term31735, term31735.getClass(), "devMinor", -341152642);
        setBooleanField(term31735, term31735.getClass(), "isExtended", false);
        setLongField(term31735, term31735.getClass(), "realSize", -7278883608542636188L);
        setBooleanField(term31735, term31735.getClass(), "paxGNUSparse", false);
        setBooleanField(term31735, term31735.getClass(), "starSparse", false);
        setField(term31748, term31748.getClass(), "path", "hxCBltsObl");
        setField(term31748, term31748.getClass(), "status", enum132);
        setIntField(term31748, term31748.getClass(), "prefixLength", -2015854073);
        setField(term31748, term31748.getClass(), "filePath", null);
        setField(term31735, term31735.getClass(), "file", term31748);
        Class<? extends Object> term32094 = Class.forName((String) "java.io.File$PathStatus");
        Field term32093 = ((Class) term32094).getDeclaredField((String) "CHECKED");
        ((Field) term32093).setAccessible(true);
        Object enum133 = ((Field) term32093).get((Object) null);
        term31671 = newInstance(Class.forName("java.io.File"));
        setField(term31671, term31671.getClass(), "path", "hxCBltsObl");
        setField(term31671, term31671.getClass(), "status", enum133);
        setIntField(term31671, term31671.getClass(), "prefixLength", -2015854073);
        setField(term31671, term31671.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFile", argTypes, term7230, args);
        assertTrue(recursiveEquals(term7230, term31735));
        assertTrue(recursiveEquals(retValue, term31671));
    }

};


