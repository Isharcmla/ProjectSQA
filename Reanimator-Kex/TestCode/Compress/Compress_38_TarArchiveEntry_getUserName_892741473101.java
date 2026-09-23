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

public class TarArchiveEntry_getUserName_892741473101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4615;
     Object term26987;

    public TarArchiveEntry_getUserName_892741473101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27028 = Class.forName((String) "java.io.File$PathStatus");
        Field term27027 = ((Class) term27028).getDeclaredField((String) "CHECKED");
        ((Field) term27027).setAccessible(true);
        Object enum109 = ((Field) term27027).get((Object) null);
        term4615 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4654 = newInstance(Class.forName("java.io.File"));
        setField(term4615, term4615.getClass(), "name", "");
        setBooleanField(term4615, term4615.getClass(), "preserveLeadingSlashes", true);
        setIntField(term4615, term4615.getClass(), "mode", 1655935355);
        setLongField(term4615, term4615.getClass(), "userId", -8085190702504231560L);
        setLongField(term4615, term4615.getClass(), "groupId", 1672578078364590450L);
        setLongField(term4615, term4615.getClass(), "size", 4949335493504695457L);
        setLongField(term4615, term4615.getClass(), "modTime", -5216789073301458893L);
        setBooleanField(term4615, term4615.getClass(), "checkSumOK", true);
        setByteField(term4615, term4615.getClass(), "linkFlag", (byte) 106);
        setField(term4615, term4615.getClass(), "linkName", "");
        setField(term4615, term4615.getClass(), "magic", "ustar ");
        setField(term4615, term4615.getClass(), "version", "00");
        setField(term4615, term4615.getClass(), "userName", "root");
        setField(term4615, term4615.getClass(), "groupName", "");
        setIntField(term4615, term4615.getClass(), "devMajor", -481533957);
        setIntField(term4615, term4615.getClass(), "devMinor", 1240914516);
        setBooleanField(term4615, term4615.getClass(), "isExtended", false);
        setLongField(term4615, term4615.getClass(), "realSize", -1832940336320585644L);
        setBooleanField(term4615, term4615.getClass(), "paxGNUSparse", true);
        setBooleanField(term4615, term4615.getClass(), "starSparse", true);
        setField(term4654, term4654.getClass(), "path", "IoAlmYsBwc");
        setField(term4654, term4654.getClass(), "status", enum109);
        setIntField(term4654, term4654.getClass(), "prefixLength", -1465035361);
        setField(term4654, term4654.getClass(), "filePath", null);
        setField(term4615, term4615.getClass(), "file", term4654);
        Class<? extends Object> term27193 = Class.forName((String) "java.io.File$PathStatus");
        Field term27192 = ((Class) term27193).getDeclaredField((String) "CHECKED");
        ((Field) term27192).setAccessible(true);
        Object enum110 = ((Field) term27192).get((Object) null);
        term26987 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term27000 = newInstance(Class.forName("java.io.File"));
        setField(term26987, term26987.getClass(), "name", "");
        setBooleanField(term26987, term26987.getClass(), "preserveLeadingSlashes", true);
        setIntField(term26987, term26987.getClass(), "mode", 1655935355);
        setLongField(term26987, term26987.getClass(), "userId", -8085190702504231560L);
        setLongField(term26987, term26987.getClass(), "groupId", 1672578078364590450L);
        setLongField(term26987, term26987.getClass(), "size", 4949335493504695457L);
        setLongField(term26987, term26987.getClass(), "modTime", -5216789073301458893L);
        setBooleanField(term26987, term26987.getClass(), "checkSumOK", true);
        setByteField(term26987, term26987.getClass(), "linkFlag", (byte) 106);
        setField(term26987, term26987.getClass(), "linkName", "");
        setField(term26987, term26987.getClass(), "magic", "ustar ");
        setField(term26987, term26987.getClass(), "version", "00");
        setField(term26987, term26987.getClass(), "userName", "root");
        setField(term26987, term26987.getClass(), "groupName", "");
        setIntField(term26987, term26987.getClass(), "devMajor", -481533957);
        setIntField(term26987, term26987.getClass(), "devMinor", 1240914516);
        setBooleanField(term26987, term26987.getClass(), "isExtended", false);
        setLongField(term26987, term26987.getClass(), "realSize", -1832940336320585644L);
        setBooleanField(term26987, term26987.getClass(), "paxGNUSparse", true);
        setBooleanField(term26987, term26987.getClass(), "starSparse", true);
        setField(term27000, term27000.getClass(), "path", "IoAlmYsBwc");
        setField(term27000, term27000.getClass(), "status", enum110);
        setIntField(term27000, term27000.getClass(), "prefixLength", -1465035361);
        setField(term27000, term27000.getClass(), "filePath", null);
        setField(term26987, term26987.getClass(), "file", term27000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getUserName", argTypes, term4615, args);
        assertTrue(recursiveEquals(term4615, term26987));
        assertTrue(recursiveEquals(retValue, "root"));
    }

};


