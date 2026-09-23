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

public class TarArchiveEntry_getLinkName_14390382491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2295;
     Object term22884;

    public TarArchiveEntry_getLinkName_14390382491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22925 = Class.forName((String) "java.io.File$PathStatus");
        Field term22924 = ((Class) term22925).getDeclaredField((String) "CHECKED");
        ((Field) term22924).setAccessible(true);
        Object enum89 = ((Field) term22924).get((Object) null);
        term2295 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2334 = newInstance(Class.forName("java.io.File"));
        setField(term2295, term2295.getClass(), "name", "");
        setBooleanField(term2295, term2295.getClass(), "preserveLeadingSlashes", true);
        setIntField(term2295, term2295.getClass(), "mode", 679763016);
        setLongField(term2295, term2295.getClass(), "userId", -7612550318181586304L);
        setLongField(term2295, term2295.getClass(), "groupId", -2170847986967241072L);
        setLongField(term2295, term2295.getClass(), "size", 4044358158040652353L);
        setLongField(term2295, term2295.getClass(), "modTime", -4443169559037975007L);
        setBooleanField(term2295, term2295.getClass(), "checkSumOK", false);
        setByteField(term2295, term2295.getClass(), "linkFlag", (byte) 121);
        setField(term2295, term2295.getClass(), "linkName", "");
        setField(term2295, term2295.getClass(), "magic", "ustar ");
        setField(term2295, term2295.getClass(), "version", "00");
        setField(term2295, term2295.getClass(), "userName", "root");
        setField(term2295, term2295.getClass(), "groupName", "");
        setIntField(term2295, term2295.getClass(), "devMajor", 1962444399);
        setIntField(term2295, term2295.getClass(), "devMinor", 767834723);
        setBooleanField(term2295, term2295.getClass(), "isExtended", true);
        setLongField(term2295, term2295.getClass(), "realSize", -3842548265506930260L);
        setBooleanField(term2295, term2295.getClass(), "paxGNUSparse", false);
        setBooleanField(term2295, term2295.getClass(), "starSparse", false);
        setField(term2334, term2334.getClass(), "path", "tbcdzjIfER");
        setField(term2334, term2334.getClass(), "status", enum89);
        setIntField(term2334, term2334.getClass(), "prefixLength", -602026508);
        setField(term2334, term2334.getClass(), "filePath", null);
        setField(term2295, term2295.getClass(), "file", term2334);
        Class<? extends Object> term23090 = Class.forName((String) "java.io.File$PathStatus");
        Field term23089 = ((Class) term23090).getDeclaredField((String) "CHECKED");
        ((Field) term23089).setAccessible(true);
        Object enum90 = ((Field) term23089).get((Object) null);
        term22884 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term22897 = newInstance(Class.forName("java.io.File"));
        setField(term22884, term22884.getClass(), "name", "");
        setBooleanField(term22884, term22884.getClass(), "preserveLeadingSlashes", true);
        setIntField(term22884, term22884.getClass(), "mode", 679763016);
        setLongField(term22884, term22884.getClass(), "userId", -7612550318181586304L);
        setLongField(term22884, term22884.getClass(), "groupId", -2170847986967241072L);
        setLongField(term22884, term22884.getClass(), "size", 4044358158040652353L);
        setLongField(term22884, term22884.getClass(), "modTime", -4443169559037975007L);
        setBooleanField(term22884, term22884.getClass(), "checkSumOK", false);
        setByteField(term22884, term22884.getClass(), "linkFlag", (byte) 121);
        setField(term22884, term22884.getClass(), "linkName", "");
        setField(term22884, term22884.getClass(), "magic", "ustar ");
        setField(term22884, term22884.getClass(), "version", "00");
        setField(term22884, term22884.getClass(), "userName", "root");
        setField(term22884, term22884.getClass(), "groupName", "");
        setIntField(term22884, term22884.getClass(), "devMajor", 1962444399);
        setIntField(term22884, term22884.getClass(), "devMinor", 767834723);
        setBooleanField(term22884, term22884.getClass(), "isExtended", true);
        setLongField(term22884, term22884.getClass(), "realSize", -3842548265506930260L);
        setBooleanField(term22884, term22884.getClass(), "paxGNUSparse", false);
        setBooleanField(term22884, term22884.getClass(), "starSparse", false);
        setField(term22897, term22897.getClass(), "path", "tbcdzjIfER");
        setField(term22897, term22897.getClass(), "status", enum90);
        setIntField(term22897, term22897.getClass(), "prefixLength", -602026508);
        setField(term22897, term22897.getClass(), "filePath", null);
        setField(term22884, term22884.getClass(), "file", term22897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLinkName", argTypes, term2295, args);
        assertTrue(recursiveEquals(term2295, term22884));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


