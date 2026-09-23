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
import java.util.HashMap;

public class TarArchiveInputStream_available_85705187343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term661;
     Object term13719;

    public TarArchiveInputStream_available_85705187343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13771 = Class.forName((String) "java.io.File$PathStatus");
        Field term13770 = ((Class) term13771).getDeclaredField((String) "INVALID");
        ((Field) term13770).setAccessible(true);
        Object enum32 = ((Field) term13770).get((Object) null);
        HashMap term742 = new HashMap();
        term661 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term662 = (byte[]) newByteArray(6);
        Object term674 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term713 = newInstance(Class.forName("java.io.File"));
        byte[] term752 = (byte[]) newByteArray(2);
        setByteElement(term662, 0, (byte) 121);
        setByteElement(term662, 1, (byte) -99);
        setByteElement(term662, 2, (byte) -2);
        setByteElement(term662, 3, (byte) -16);
        setByteElement(term662, 4, (byte) -112);
        setByteElement(term662, 5, (byte) -111);
        setField(term661, term661.getClass(), "SMALL_BUF", term662);
        setIntField(term661, term661.getClass(), "recordSize", 1622346318);
        setIntField(term661, term661.getClass(), "blockSize", 1048535127);
        setBooleanField(term661, term661.getClass(), "hasHitEOF", false);
        setLongField(term661, term661.getClass(), "entrySize", -316468845751588286L);
        setLongField(term661, term661.getClass(), "entryOffset", 5127676408959197577L);
        setField(term661, term661.getClass(), "is", null);
        setField(term674, term674.getClass(), "name", "");
        setBooleanField(term674, term674.getClass(), "preserveLeadingSlashes", true);
        setIntField(term674, term674.getClass(), "mode", -655067527);
        setLongField(term674, term674.getClass(), "userId", -6573104506744284592L);
        setLongField(term674, term674.getClass(), "groupId", -4920224193275732920L);
        setLongField(term674, term674.getClass(), "size", 8428634514691209827L);
        setLongField(term674, term674.getClass(), "modTime", -2585684163342970173L);
        setBooleanField(term674, term674.getClass(), "checkSumOK", false);
        setByteField(term674, term674.getClass(), "linkFlag", (byte) 23);
        setField(term674, term674.getClass(), "linkName", "");
        setField(term674, term674.getClass(), "magic", "ustar ");
        setField(term674, term674.getClass(), "version", "00");
        setField(term674, term674.getClass(), "userName", "root");
        setField(term674, term674.getClass(), "groupName", "");
        setIntField(term674, term674.getClass(), "devMajor", -6029667);
        setIntField(term674, term674.getClass(), "devMinor", -2068769794);
        setBooleanField(term674, term674.getClass(), "isExtended", false);
        setLongField(term674, term674.getClass(), "realSize", 8059786003080744426L);
        setBooleanField(term674, term674.getClass(), "paxGNUSparse", true);
        setBooleanField(term674, term674.getClass(), "starSparse", true);
        setField(term713, term713.getClass(), "path", "uuaPigETmJ");
        setField(term713, term713.getClass(), "status", enum32);
        setIntField(term713, term713.getClass(), "prefixLength", -117576464);
        setField(term713, term713.getClass(), "filePath", null);
        setField(term674, term674.getClass(), "file", term713);
        setField(term661, term661.getClass(), "currEntry", term674);
        setField(term661, term661.getClass(), "zipEncoding", null);
        setField(term661, term661.getClass(), "encoding", "MxlszYVzRf");
        setField(term661, term661.getClass(), "globalPaxHeaders", term742);
        setByteElement(term752, 0, (byte) -15);
        setByteElement(term752, 1, (byte) 36);
        setField(term661, term661.getClass(), "SINGLE", term752);
        setLongField(term661, term661.getClass(), "bytesRead", -4365849114644724155L);
        Class<? extends Object> term13954 = Class.forName((String) "java.io.File$PathStatus");
        Field term13953 = ((Class) term13954).getDeclaredField((String) "INVALID");
        ((Field) term13953).setAccessible(true);
        Object enum33 = ((Field) term13953).get((Object) null);
        HashMap term13741 = new HashMap();
        term13719 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term13720 = (byte[]) newByteArray(6);
        Object term13721 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term13734 = newInstance(Class.forName("java.io.File"));
        byte[] term13742 = (byte[]) newByteArray(2);
        setByteElement(term13720, 0, (byte) 121);
        setByteElement(term13720, 1, (byte) -99);
        setByteElement(term13720, 2, (byte) -2);
        setByteElement(term13720, 3, (byte) -16);
        setByteElement(term13720, 4, (byte) -112);
        setByteElement(term13720, 5, (byte) -111);
        setField(term13719, term13719.getClass(), "SMALL_BUF", term13720);
        setIntField(term13719, term13719.getClass(), "recordSize", 1622346318);
        setIntField(term13719, term13719.getClass(), "blockSize", 1048535127);
        setBooleanField(term13719, term13719.getClass(), "hasHitEOF", false);
        setLongField(term13719, term13719.getClass(), "entrySize", -316468845751588286L);
        setLongField(term13719, term13719.getClass(), "entryOffset", 5127676408959197577L);
        setField(term13719, term13719.getClass(), "is", null);
        setField(term13721, term13721.getClass(), "name", "");
        setBooleanField(term13721, term13721.getClass(), "preserveLeadingSlashes", true);
        setIntField(term13721, term13721.getClass(), "mode", -655067527);
        setLongField(term13721, term13721.getClass(), "userId", -6573104506744284592L);
        setLongField(term13721, term13721.getClass(), "groupId", -4920224193275732920L);
        setLongField(term13721, term13721.getClass(), "size", 8428634514691209827L);
        setLongField(term13721, term13721.getClass(), "modTime", -2585684163342970173L);
        setBooleanField(term13721, term13721.getClass(), "checkSumOK", false);
        setByteField(term13721, term13721.getClass(), "linkFlag", (byte) 23);
        setField(term13721, term13721.getClass(), "linkName", "");
        setField(term13721, term13721.getClass(), "magic", "ustar ");
        setField(term13721, term13721.getClass(), "version", "00");
        setField(term13721, term13721.getClass(), "userName", "root");
        setField(term13721, term13721.getClass(), "groupName", "");
        setIntField(term13721, term13721.getClass(), "devMajor", -6029667);
        setIntField(term13721, term13721.getClass(), "devMinor", -2068769794);
        setBooleanField(term13721, term13721.getClass(), "isExtended", false);
        setLongField(term13721, term13721.getClass(), "realSize", 8059786003080744426L);
        setBooleanField(term13721, term13721.getClass(), "paxGNUSparse", true);
        setBooleanField(term13721, term13721.getClass(), "starSparse", true);
        setField(term13734, term13734.getClass(), "path", "uuaPigETmJ");
        setField(term13734, term13734.getClass(), "status", enum33);
        setIntField(term13734, term13734.getClass(), "prefixLength", -117576464);
        setField(term13734, term13734.getClass(), "filePath", null);
        setField(term13721, term13721.getClass(), "file", term13734);
        setField(term13719, term13719.getClass(), "currEntry", term13721);
        setField(term13719, term13719.getClass(), "zipEncoding", null);
        setField(term13719, term13719.getClass(), "encoding", "MxlszYVzRf");
        setField(term13719, term13719.getClass(), "globalPaxHeaders", term13741);
        setByteElement(term13742, 0, (byte) -15);
        setByteElement(term13742, 1, (byte) 36);
        setField(term13719, term13719.getClass(), "SINGLE", term13742);
        setLongField(term13719, term13719.getClass(), "bytesRead", -4365849114644724155L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "available", argTypes, term661, args);
        assertTrue(recursiveEquals(term661, term13719));
        assertTrue(recursiveEquals(retValue, 861259961));
    }

};


