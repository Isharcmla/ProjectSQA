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

public class TarArchiveEntry_setGroupName_119839447104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5324;
     Object term28297;

    public TarArchiveEntry_setGroupName_119839447104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28340 = Class.forName((String) "java.io.File$PathStatus");
        Field term28339 = ((Class) term28340).getDeclaredField((String) "CHECKED");
        ((Field) term28339).setAccessible(true);
        Object enum115 = ((Field) term28339).get((Object) null);
        term5324 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5363 = newInstance(Class.forName("java.io.File"));
        setField(term5324, term5324.getClass(), "name", "");
        setBooleanField(term5324, term5324.getClass(), "preserveLeadingSlashes", true);
        setIntField(term5324, term5324.getClass(), "mode", -344842608);
        setLongField(term5324, term5324.getClass(), "userId", -6950146046121430355L);
        setLongField(term5324, term5324.getClass(), "groupId", 1667122142089513324L);
        setLongField(term5324, term5324.getClass(), "size", -6342139649364011743L);
        setLongField(term5324, term5324.getClass(), "modTime", -4924950707540628022L);
        setBooleanField(term5324, term5324.getClass(), "checkSumOK", false);
        setByteField(term5324, term5324.getClass(), "linkFlag", (byte) 66);
        setField(term5324, term5324.getClass(), "linkName", "");
        setField(term5324, term5324.getClass(), "magic", "ustar ");
        setField(term5324, term5324.getClass(), "version", "00");
        setField(term5324, term5324.getClass(), "userName", "root");
        setField(term5324, term5324.getClass(), "groupName", "");
        setIntField(term5324, term5324.getClass(), "devMajor", 941650513);
        setIntField(term5324, term5324.getClass(), "devMinor", 444029505);
        setBooleanField(term5324, term5324.getClass(), "isExtended", false);
        setLongField(term5324, term5324.getClass(), "realSize", -4393710401270724527L);
        setBooleanField(term5324, term5324.getClass(), "paxGNUSparse", false);
        setBooleanField(term5324, term5324.getClass(), "starSparse", true);
        setField(term5363, term5363.getClass(), "path", "AijpHYOFuy");
        setField(term5363, term5363.getClass(), "status", enum115);
        setIntField(term5363, term5363.getClass(), "prefixLength", -1034506028);
        setField(term5363, term5363.getClass(), "filePath", null);
        setField(term5324, term5324.getClass(), "file", term5363);
        Class<? extends Object> term28525 = Class.forName((String) "java.io.File$PathStatus");
        Field term28524 = ((Class) term28525).getDeclaredField((String) "CHECKED");
        ((Field) term28524).setAccessible(true);
        Object enum116 = ((Field) term28524).get((Object) null);
        term28297 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term28310 = newInstance(Class.forName("java.io.File"));
        setField(term28297, term28297.getClass(), "name", "");
        setBooleanField(term28297, term28297.getClass(), "preserveLeadingSlashes", true);
        setIntField(term28297, term28297.getClass(), "mode", -344842608);
        setLongField(term28297, term28297.getClass(), "userId", -6950146046121430355L);
        setLongField(term28297, term28297.getClass(), "groupId", 1667122142089513324L);
        setLongField(term28297, term28297.getClass(), "size", -6342139649364011743L);
        setLongField(term28297, term28297.getClass(), "modTime", -4924950707540628022L);
        setBooleanField(term28297, term28297.getClass(), "checkSumOK", false);
        setByteField(term28297, term28297.getClass(), "linkFlag", (byte) 66);
        setField(term28297, term28297.getClass(), "linkName", "");
        setField(term28297, term28297.getClass(), "magic", "ustar ");
        setField(term28297, term28297.getClass(), "version", "00");
        setField(term28297, term28297.getClass(), "userName", "root");
        setField(term28297, term28297.getClass(), "groupName", "SbAoxhfrkn");
        setIntField(term28297, term28297.getClass(), "devMajor", 941650513);
        setIntField(term28297, term28297.getClass(), "devMinor", 444029505);
        setBooleanField(term28297, term28297.getClass(), "isExtended", false);
        setLongField(term28297, term28297.getClass(), "realSize", -4393710401270724527L);
        setBooleanField(term28297, term28297.getClass(), "paxGNUSparse", false);
        setBooleanField(term28297, term28297.getClass(), "starSparse", true);
        setField(term28310, term28310.getClass(), "path", "AijpHYOFuy");
        setField(term28310, term28310.getClass(), "status", enum116);
        setIntField(term28310, term28310.getClass(), "prefixLength", -1034506028);
        setField(term28310, term28310.getClass(), "filePath", null);
        setField(term28297, term28297.getClass(), "file", term28310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SbAoxhfrkn";
        callMethod(klass, "setGroupName", argTypes, term5324, args);
        assertTrue(recursiveEquals(term5324, term28297));
    }

};


