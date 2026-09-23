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

public class TarArchiveInputStream_setCurrentEntry_80530496661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5582;
     Object term5648;
     Object term21492;
     Object term21513;

    public TarArchiveInputStream_setCurrentEntry_80530496661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21554 = Class.forName((String) "java.io.File$PathStatus");
        Field term21553 = ((Class) term21554).getDeclaredField((String) "INVALID");
        ((Field) term21553).setAccessible(true);
        Object enum61 = ((Field) term21553).get((Object) null);
        term5582 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term5583 = (byte[]) newByteArray(0);
        Object term5589 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5625 = newInstance(Class.forName("java.io.File"));
        byte[] term5642 = (byte[]) newByteArray(4);
        setField(term5582, term5582.getClass(), "SMALL_BUF", term5583);
        setIntField(term5582, term5582.getClass(), "recordSize", -507387516);
        setIntField(term5582, term5582.getClass(), "blockSize", -1970452551);
        setBooleanField(term5582, term5582.getClass(), "hasHitEOF", true);
        setLongField(term5582, term5582.getClass(), "entrySize", 6843866297465638866L);
        setLongField(term5582, term5582.getClass(), "entryOffset", -4023935540989049732L);
        setField(term5582, term5582.getClass(), "is", null);
        setField(term5589, term5589.getClass(), "name", "");
        setIntField(term5589, term5589.getClass(), "mode", -1896376975);
        setIntField(term5589, term5589.getClass(), "userId", 729658803);
        setIntField(term5589, term5589.getClass(), "groupId", 114754804);
        setLongField(term5589, term5589.getClass(), "size", 855932984568615096L);
        setLongField(term5589, term5589.getClass(), "modTime", -1616722610139554082L);
        setBooleanField(term5589, term5589.getClass(), "checkSumOK", true);
        setByteField(term5589, term5589.getClass(), "linkFlag", (byte) 119);
        setField(term5589, term5589.getClass(), "linkName", "");
        setField(term5589, term5589.getClass(), "magic", "ustar ");
        setField(term5589, term5589.getClass(), "version", "00");
        setField(term5589, term5589.getClass(), "userName", "root");
        setField(term5589, term5589.getClass(), "groupName", "");
        setIntField(term5589, term5589.getClass(), "devMajor", 1687361082);
        setIntField(term5589, term5589.getClass(), "devMinor", 584893196);
        setBooleanField(term5589, term5589.getClass(), "isExtended", true);
        setLongField(term5589, term5589.getClass(), "realSize", 7495904023107549024L);
        setField(term5625, term5625.getClass(), "path", "Ghbwtircqb");
        setField(term5625, term5625.getClass(), "status", enum61);
        setIntField(term5625, term5625.getClass(), "prefixLength", 497269071);
        setField(term5625, term5625.getClass(), "filePath", null);
        setField(term5589, term5589.getClass(), "file", term5625);
        setField(term5582, term5582.getClass(), "currEntry", term5589);
        setField(term5582, term5582.getClass(), "zipEncoding", null);
        setByteElement(term5642, 0, (byte) -125);
        setByteElement(term5642, 1, (byte) 100);
        setByteElement(term5642, 2, (byte) -1);
        setByteElement(term5642, 3, (byte) -127);
        setField(term5582, term5582.getClass(), "SINGLE", term5642);
        setLongField(term5582, term5582.getClass(), "bytesRead", 8802866251294305945L);
        term5648 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5684 = newInstance(Class.forName("java.io.File"));
        setField(term5648, term5648.getClass(), "name", "");
        setIntField(term5648, term5648.getClass(), "mode", -1899301124);
        setIntField(term5648, term5648.getClass(), "userId", -1882480155);
        setIntField(term5648, term5648.getClass(), "groupId", -1410220680);
        setLongField(term5648, term5648.getClass(), "size", 4513004407927379358L);
        setLongField(term5648, term5648.getClass(), "modTime", -7115418542247301000L);
        setBooleanField(term5648, term5648.getClass(), "checkSumOK", false);
        setByteField(term5648, term5648.getClass(), "linkFlag", (byte) -118);
        setField(term5648, term5648.getClass(), "linkName", "");
        setField(term5648, term5648.getClass(), "magic", "ustar ");
        setField(term5648, term5648.getClass(), "version", "00");
        setField(term5648, term5648.getClass(), "userName", "root");
        setField(term5648, term5648.getClass(), "groupName", "");
        setIntField(term5648, term5648.getClass(), "devMajor", 389427431);
        setIntField(term5648, term5648.getClass(), "devMinor", -1945706126);
        setBooleanField(term5648, term5648.getClass(), "isExtended", false);
        setLongField(term5648, term5648.getClass(), "realSize", 8034714140377562739L);
        setField(term5684, term5684.getClass(), "path", "xrwlQZdwCp");
        setField(term5684, term5684.getClass(), "status", enum61);
        setIntField(term5684, term5684.getClass(), "prefixLength", 1152356969);
        setField(term5684, term5684.getClass(), "filePath", null);
        setField(term5648, term5648.getClass(), "file", term5684);
        Class<? extends Object> term21744 = Class.forName((String) "java.io.File$PathStatus");
        Field term21743 = ((Class) term21744).getDeclaredField((String) "INVALID");
        ((Field) term21743).setAccessible(true);
        Object enum62 = ((Field) term21743).get((Object) null);
        term21492 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term21493 = (byte[]) newByteArray(0);
        Object term21494 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term21507 = newInstance(Class.forName("java.io.File"));
        byte[] term21512 = (byte[]) newByteArray(4);
        setField(term21492, term21492.getClass(), "SMALL_BUF", term21493);
        setIntField(term21492, term21492.getClass(), "recordSize", -507387516);
        setIntField(term21492, term21492.getClass(), "blockSize", -1970452551);
        setBooleanField(term21492, term21492.getClass(), "hasHitEOF", true);
        setLongField(term21492, term21492.getClass(), "entrySize", 6843866297465638866L);
        setLongField(term21492, term21492.getClass(), "entryOffset", -4023935540989049732L);
        setField(term21492, term21492.getClass(), "is", null);
        setField(term21494, term21494.getClass(), "name", "");
        setIntField(term21494, term21494.getClass(), "mode", -1899301124);
        setIntField(term21494, term21494.getClass(), "userId", -1882480155);
        setIntField(term21494, term21494.getClass(), "groupId", -1410220680);
        setLongField(term21494, term21494.getClass(), "size", 4513004407927379358L);
        setLongField(term21494, term21494.getClass(), "modTime", -7115418542247301000L);
        setBooleanField(term21494, term21494.getClass(), "checkSumOK", false);
        setByteField(term21494, term21494.getClass(), "linkFlag", (byte) -118);
        setField(term21494, term21494.getClass(), "linkName", "");
        setField(term21494, term21494.getClass(), "magic", "ustar ");
        setField(term21494, term21494.getClass(), "version", "00");
        setField(term21494, term21494.getClass(), "userName", "root");
        setField(term21494, term21494.getClass(), "groupName", "");
        setIntField(term21494, term21494.getClass(), "devMajor", 389427431);
        setIntField(term21494, term21494.getClass(), "devMinor", -1945706126);
        setBooleanField(term21494, term21494.getClass(), "isExtended", false);
        setLongField(term21494, term21494.getClass(), "realSize", 8034714140377562739L);
        setField(term21507, term21507.getClass(), "path", "xrwlQZdwCp");
        setField(term21507, term21507.getClass(), "status", enum62);
        setIntField(term21507, term21507.getClass(), "prefixLength", 1152356969);
        setField(term21507, term21507.getClass(), "filePath", null);
        setField(term21494, term21494.getClass(), "file", term21507);
        setField(term21492, term21492.getClass(), "currEntry", term21494);
        setField(term21492, term21492.getClass(), "zipEncoding", null);
        setByteElement(term21512, 0, (byte) -125);
        setByteElement(term21512, 1, (byte) 100);
        setByteElement(term21512, 2, (byte) -1);
        setByteElement(term21512, 3, (byte) -127);
        setField(term21492, term21492.getClass(), "SINGLE", term21512);
        setLongField(term21492, term21492.getClass(), "bytesRead", 8802866251294305945L);
        Class<? extends Object> term21913 = Class.forName((String) "java.io.File$PathStatus");
        Field term21912 = ((Class) term21913).getDeclaredField((String) "INVALID");
        ((Field) term21912).setAccessible(true);
        Object enum63 = ((Field) term21912).get((Object) null);
        term21513 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term21526 = newInstance(Class.forName("java.io.File"));
        setField(term21513, term21513.getClass(), "name", "");
        setIntField(term21513, term21513.getClass(), "mode", -1899301124);
        setIntField(term21513, term21513.getClass(), "userId", -1882480155);
        setIntField(term21513, term21513.getClass(), "groupId", -1410220680);
        setLongField(term21513, term21513.getClass(), "size", 4513004407927379358L);
        setLongField(term21513, term21513.getClass(), "modTime", -7115418542247301000L);
        setBooleanField(term21513, term21513.getClass(), "checkSumOK", false);
        setByteField(term21513, term21513.getClass(), "linkFlag", (byte) -118);
        setField(term21513, term21513.getClass(), "linkName", "");
        setField(term21513, term21513.getClass(), "magic", "ustar ");
        setField(term21513, term21513.getClass(), "version", "00");
        setField(term21513, term21513.getClass(), "userName", "root");
        setField(term21513, term21513.getClass(), "groupName", "");
        setIntField(term21513, term21513.getClass(), "devMajor", 389427431);
        setIntField(term21513, term21513.getClass(), "devMinor", -1945706126);
        setBooleanField(term21513, term21513.getClass(), "isExtended", false);
        setLongField(term21513, term21513.getClass(), "realSize", 8034714140377562739L);
        setField(term21526, term21526.getClass(), "path", "xrwlQZdwCp");
        setField(term21526, term21526.getClass(), "status", enum63);
        setIntField(term21526, term21526.getClass(), "prefixLength", 1152356969);
        setField(term21526, term21526.getClass(), "filePath", null);
        setField(term21513, term21513.getClass(), "file", term21526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term5648;
        callMethod(klass, "setCurrentEntry", argTypes, term5582, args);
        assertTrue(recursiveEquals(term5582, term21492));
        assertTrue(recursiveEquals(term5648, term21513));
    }

};


