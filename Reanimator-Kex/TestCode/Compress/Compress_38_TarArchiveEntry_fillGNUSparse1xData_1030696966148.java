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
import java.lang.NumberFormatException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashMap;

public class TarArchiveEntry_fillGNUSparse1xData_1030696966148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15427;
     Object term15491;

    public TarArchiveEntry_fillGNUSparse1xData_1030696966148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46882 = Class.forName((String) "java.io.File$PathStatus");
        Field term46881 = ((Class) term46882).getDeclaredField((String) "CHECKED");
        ((Field) term46881).setAccessible(true);
        Object enum191 = ((Field) term46881).get((Object) null);
        term15427 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term15466 = newInstance(Class.forName("java.io.File"));
        setField(term15427, term15427.getClass(), "name", "");
        setBooleanField(term15427, term15427.getClass(), "preserveLeadingSlashes", true);
        setIntField(term15427, term15427.getClass(), "mode", -1195339592);
        setLongField(term15427, term15427.getClass(), "userId", 3746481521207337771L);
        setLongField(term15427, term15427.getClass(), "groupId", 4341016500855678917L);
        setLongField(term15427, term15427.getClass(), "size", -5871746020807491998L);
        setLongField(term15427, term15427.getClass(), "modTime", 4742108233936970770L);
        setBooleanField(term15427, term15427.getClass(), "checkSumOK", true);
        setByteField(term15427, term15427.getClass(), "linkFlag", (byte) 123);
        setField(term15427, term15427.getClass(), "linkName", "");
        setField(term15427, term15427.getClass(), "magic", "ustar ");
        setField(term15427, term15427.getClass(), "version", "00");
        setField(term15427, term15427.getClass(), "userName", "root");
        setField(term15427, term15427.getClass(), "groupName", "");
        setIntField(term15427, term15427.getClass(), "devMajor", -376422566);
        setIntField(term15427, term15427.getClass(), "devMinor", 306847454);
        setBooleanField(term15427, term15427.getClass(), "isExtended", false);
        setLongField(term15427, term15427.getClass(), "realSize", 2722004046017350471L);
        setBooleanField(term15427, term15427.getClass(), "paxGNUSparse", true);
        setBooleanField(term15427, term15427.getClass(), "starSparse", false);
        setField(term15466, term15466.getClass(), "path", "DfISiziTgG");
        setField(term15466, term15466.getClass(), "status", enum191);
        setIntField(term15466, term15466.getClass(), "prefixLength", 1745276158);
        setField(term15466, term15466.getClass(), "filePath", null);
        setField(term15427, term15427.getClass(), "file", term15466);
        term15491 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term15491;
        try {
            callMethod(klass, "fillGNUSparse1xData", argTypes, term15427, args);
            assertTrue(false);
        }
        catch (NumberFormatException e) {
        }

    }

};


