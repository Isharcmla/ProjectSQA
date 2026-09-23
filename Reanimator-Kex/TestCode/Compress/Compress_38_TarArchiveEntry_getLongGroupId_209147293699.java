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

public class TarArchiveEntry_getLongGroupId_209147293699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4155;
     Object term26156;

    public TarArchiveEntry_getLongGroupId_209147293699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26262 = Class.forName((String) "java.io.File$PathStatus");
        Field term26261 = ((Class) term26262).getDeclaredField((String) "INVALID");
        ((Field) term26261).setAccessible(true);
        Object enum105 = ((Field) term26261).get((Object) null);
        term4155 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4194 = newInstance(Class.forName("java.io.File"));
        setField(term4155, term4155.getClass(), "name", "");
        setBooleanField(term4155, term4155.getClass(), "preserveLeadingSlashes", false);
        setIntField(term4155, term4155.getClass(), "mode", 1265463001);
        setLongField(term4155, term4155.getClass(), "userId", 4474998035090263139L);
        setLongField(term4155, term4155.getClass(), "groupId", 2848819812340321742L);
        setLongField(term4155, term4155.getClass(), "size", -8876856890348836498L);
        setLongField(term4155, term4155.getClass(), "modTime", 846579494941632714L);
        setBooleanField(term4155, term4155.getClass(), "checkSumOK", false);
        setByteField(term4155, term4155.getClass(), "linkFlag", (byte) 36);
        setField(term4155, term4155.getClass(), "linkName", "");
        setField(term4155, term4155.getClass(), "magic", "ustar ");
        setField(term4155, term4155.getClass(), "version", "00");
        setField(term4155, term4155.getClass(), "userName", "root");
        setField(term4155, term4155.getClass(), "groupName", "");
        setIntField(term4155, term4155.getClass(), "devMajor", 335112684);
        setIntField(term4155, term4155.getClass(), "devMinor", 1551099402);
        setBooleanField(term4155, term4155.getClass(), "isExtended", true);
        setLongField(term4155, term4155.getClass(), "realSize", 6689117472719450333L);
        setBooleanField(term4155, term4155.getClass(), "paxGNUSparse", true);
        setBooleanField(term4155, term4155.getClass(), "starSparse", true);
        setField(term4194, term4194.getClass(), "path", "flxyYxBRtu");
        setField(term4194, term4194.getClass(), "status", enum105);
        setIntField(term4194, term4194.getClass(), "prefixLength", -2027534003);
        setField(term4194, term4194.getClass(), "filePath", null);
        setField(term4155, term4155.getClass(), "file", term4194);
        Class<? extends Object> term26427 = Class.forName((String) "java.io.File$PathStatus");
        Field term26426 = ((Class) term26427).getDeclaredField((String) "INVALID");
        ((Field) term26426).setAccessible(true);
        Object enum106 = ((Field) term26426).get((Object) null);
        term26156 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term26169 = newInstance(Class.forName("java.io.File"));
        setField(term26156, term26156.getClass(), "name", "");
        setBooleanField(term26156, term26156.getClass(), "preserveLeadingSlashes", false);
        setIntField(term26156, term26156.getClass(), "mode", 1265463001);
        setLongField(term26156, term26156.getClass(), "userId", 4474998035090263139L);
        setLongField(term26156, term26156.getClass(), "groupId", 2848819812340321742L);
        setLongField(term26156, term26156.getClass(), "size", -8876856890348836498L);
        setLongField(term26156, term26156.getClass(), "modTime", 846579494941632714L);
        setBooleanField(term26156, term26156.getClass(), "checkSumOK", false);
        setByteField(term26156, term26156.getClass(), "linkFlag", (byte) 36);
        setField(term26156, term26156.getClass(), "linkName", "");
        setField(term26156, term26156.getClass(), "magic", "ustar ");
        setField(term26156, term26156.getClass(), "version", "00");
        setField(term26156, term26156.getClass(), "userName", "root");
        setField(term26156, term26156.getClass(), "groupName", "");
        setIntField(term26156, term26156.getClass(), "devMajor", 335112684);
        setIntField(term26156, term26156.getClass(), "devMinor", 1551099402);
        setBooleanField(term26156, term26156.getClass(), "isExtended", true);
        setLongField(term26156, term26156.getClass(), "realSize", 6689117472719450333L);
        setBooleanField(term26156, term26156.getClass(), "paxGNUSparse", true);
        setBooleanField(term26156, term26156.getClass(), "starSparse", true);
        setField(term26169, term26169.getClass(), "path", "flxyYxBRtu");
        setField(term26169, term26169.getClass(), "status", enum106);
        setIntField(term26169, term26169.getClass(), "prefixLength", -2027534003);
        setField(term26169, term26169.getClass(), "filePath", null);
        setField(term26156, term26156.getClass(), "file", term26169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLongGroupId", argTypes, term4155, args);
        assertTrue(recursiveEquals(term4155, term26156));
        assertTrue(recursiveEquals(retValue, 2848819812340321742L));
    }

};


