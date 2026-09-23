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
import java.lang.Integer;

public class TarArchiveOutputStream_setBigNumberMode_173634586141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144;
     Object term184;
     Object term54244;

    public TarArchiveOutputStream_setBigNumberMode_173634586141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term159 = (byte[]) newByteArray(4);
        byte[] term165 = (byte[]) newByteArray(1);
        byte[] term176 = (byte[]) newByteArray(6);
        setLongField(term144, term144.getClass(), "currSize", -8400487765614892086L);
        setField(term144, term144.getClass(), "currName", "jJCZpVmanW");
        setLongField(term144, term144.getClass(), "currBytes", 5270370404989704783L);
        setByteElement(term159, 0, (byte) 83);
        setByteElement(term159, 1, (byte) 74);
        setByteElement(term159, 2, (byte) -71);
        setByteElement(term159, 3, (byte) 49);
        setField(term144, term144.getClass(), "recordBuf", term159);
        setIntField(term144, term144.getClass(), "assemLen", -1456670397);
        setByteElement(term165, 0, (byte) -54);
        setField(term144, term144.getClass(), "assemBuf", term165);
        setIntField(term144, term144.getClass(), "longFileMode", 1622346318);
        setIntField(term144, term144.getClass(), "bigNumberMode", 1048535127);
        setIntField(term144, term144.getClass(), "recordsWritten", -655067527);
        setIntField(term144, term144.getClass(), "recordsPerBlock", -6029667);
        setIntField(term144, term144.getClass(), "recordSize", -2068769794);
        setBooleanField(term144, term144.getClass(), "closed", true);
        setBooleanField(term144, term144.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term144, term144.getClass(), "finished", true);
        setField(term144, term144.getClass(), "out", null);
        setField(term144, term144.getClass(), "zipEncoding", null);
        setBooleanField(term144, term144.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term176, 0, (byte) 67);
        setByteElement(term176, 1, (byte) 78);
        setByteElement(term176, 2, (byte) 87);
        setByteElement(term176, 3, (byte) 121);
        setByteElement(term176, 4, (byte) -99);
        setByteElement(term176, 5, (byte) -2);
        setField(term144, term144.getClass(), "oneByte", term176);
        setLongField(term144, term144.getClass(), "bytesWritten", 7411271909051562686L);
        term184 = new Integer(-117576464);
        term54244 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term54247 = (byte[]) newByteArray(4);
        byte[] term54248 = (byte[]) newByteArray(1);
        byte[] term54249 = (byte[]) newByteArray(6);
        setLongField(term54244, term54244.getClass(), "currSize", -8400487765614892086L);
        setField(term54244, term54244.getClass(), "currName", "jJCZpVmanW");
        setLongField(term54244, term54244.getClass(), "currBytes", 5270370404989704783L);
        setByteElement(term54247, 0, (byte) 83);
        setByteElement(term54247, 1, (byte) 74);
        setByteElement(term54247, 2, (byte) -71);
        setByteElement(term54247, 3, (byte) 49);
        setField(term54244, term54244.getClass(), "recordBuf", term54247);
        setIntField(term54244, term54244.getClass(), "assemLen", -1456670397);
        setByteElement(term54248, 0, (byte) -54);
        setField(term54244, term54244.getClass(), "assemBuf", term54248);
        setIntField(term54244, term54244.getClass(), "longFileMode", 1622346318);
        setIntField(term54244, term54244.getClass(), "bigNumberMode", -117576464);
        setIntField(term54244, term54244.getClass(), "recordsWritten", -655067527);
        setIntField(term54244, term54244.getClass(), "recordsPerBlock", -6029667);
        setIntField(term54244, term54244.getClass(), "recordSize", -2068769794);
        setBooleanField(term54244, term54244.getClass(), "closed", true);
        setBooleanField(term54244, term54244.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term54244, term54244.getClass(), "finished", true);
        setField(term54244, term54244.getClass(), "out", null);
        setField(term54244, term54244.getClass(), "zipEncoding", null);
        setBooleanField(term54244, term54244.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term54249, 0, (byte) 67);
        setByteElement(term54249, 1, (byte) 78);
        setByteElement(term54249, 2, (byte) 87);
        setByteElement(term54249, 3, (byte) 121);
        setByteElement(term54249, 4, (byte) -99);
        setByteElement(term54249, 5, (byte) -2);
        setField(term54244, term54244.getClass(), "oneByte", term54249);
        setLongField(term54244, term54244.getClass(), "bytesWritten", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term184;
        callMethod(klass, "setBigNumberMode", argTypes, term144, args);
        assertTrue(recursiveEquals(term144, term54244));
        assertTrue(recursiveEquals(term184, -117576464));
    }

};


