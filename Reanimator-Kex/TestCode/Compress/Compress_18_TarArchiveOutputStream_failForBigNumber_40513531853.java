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
import java.lang.RuntimeException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class TarArchiveOutputStream_failForBigNumber_40513531853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2476;
     Object term2539;
     Object term2541;

    public TarArchiveOutputStream_failForBigNumber_40513531853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2476 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term2491 = (byte[]) newByteArray(7);
        byte[] term2500 = (byte[]) newByteArray(1);
        Object term2502 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term2506 = (byte[]) newByteArray(6);
        byte[] term2521 = (byte[]) newByteArray(4);
        setLongField(term2476, term2476.getClass(), "currSize", -8658027316505137504L);
        setField(term2476, term2476.getClass(), "currName", "UlajhuVLaP");
        setLongField(term2476, term2476.getClass(), "currBytes", 414749984815662075L);
        setByteElement(term2491, 0, (byte) -4);
        setByteElement(term2491, 1, (byte) -61);
        setByteElement(term2491, 2, (byte) -34);
        setByteElement(term2491, 3, (byte) 73);
        setByteElement(term2491, 4, (byte) 10);
        setByteElement(term2491, 5, (byte) 36);
        setByteElement(term2491, 6, (byte) 103);
        setField(term2476, term2476.getClass(), "recordBuf", term2491);
        setIntField(term2476, term2476.getClass(), "assemLen", 937859191);
        setByteElement(term2500, 0, (byte) -64);
        setField(term2476, term2476.getClass(), "assemBuf", term2500);
        setField(term2502, term2502.getClass(), "inStream", null);
        setField(term2502, term2502.getClass(), "outStream", null);
        setIntField(term2502, term2502.getClass(), "blockSize", -916584829);
        setIntField(term2502, term2502.getClass(), "recordSize", -2131181468);
        setIntField(term2502, term2502.getClass(), "recsPerBlock", 282916351);
        setByteElement(term2506, 0, (byte) -107);
        setByteElement(term2506, 1, (byte) 119);
        setByteElement(term2506, 2, (byte) -109);
        setByteElement(term2506, 3, (byte) 87);
        setByteElement(term2506, 4, (byte) 97);
        setByteElement(term2506, 5, (byte) 51);
        setField(term2502, term2502.getClass(), "blockBuffer", term2506);
        setIntField(term2502, term2502.getClass(), "currBlkIdx", 880977281);
        setIntField(term2502, term2502.getClass(), "currRecIdx", 371943306);
        setField(term2476, term2476.getClass(), "buffer", term2502);
        setIntField(term2476, term2476.getClass(), "longFileMode", 982388293);
        setIntField(term2476, term2476.getClass(), "bigNumberMode", -159494544);
        setBooleanField(term2476, term2476.getClass(), "closed", false);
        setBooleanField(term2476, term2476.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term2476, term2476.getClass(), "finished", false);
        setField(term2476, term2476.getClass(), "out", null);
        setField(term2476, term2476.getClass(), "encoding", null);
        setBooleanField(term2476, term2476.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term2521, 0, (byte) 24);
        setByteElement(term2521, 1, (byte) -14);
        setByteElement(term2521, 2, (byte) 74);
        setByteElement(term2521, 3, (byte) 56);
        setField(term2476, term2476.getClass(), "oneByte", term2521);
        setLongField(term2476, term2476.getClass(), "bytesWritten", 463622836963501975L);
        term2539 = new Long(305759998609888272L);
        term2541 = new Long(-8654565919063661957L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = "gGSMzuGICf";
        args[1] = term2539;
        args[2] = term2541;
        try {
            callMethod(klass, "failForBigNumber", argTypes, term2476, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


