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
import java.io.IOException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class TarArchiveOutputStream_write_164325068047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839;
     Object term892;
     Object term901;
     Object term903;

    public TarArchiveOutputStream_write_164325068047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term839 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term854 = (byte[]) newByteArray(4);
        byte[] term860 = (byte[]) newByteArray(8);
        Object term869 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term873 = (byte[]) newByteArray(6);
        byte[] term888 = (byte[]) newByteArray(2);
        setLongField(term839, term839.getClass(), "currSize", 6855071767938501807L);
        setField(term839, term839.getClass(), "currName", "LQFpaHEwXR");
        setLongField(term839, term839.getClass(), "currBytes", -5892135042702373494L);
        setByteElement(term854, 0, (byte) -76);
        setByteElement(term854, 1, (byte) -115);
        setByteElement(term854, 2, (byte) -48);
        setByteElement(term854, 3, (byte) 126);
        setField(term839, term839.getClass(), "recordBuf", term854);
        setIntField(term839, term839.getClass(), "assemLen", -341962980);
        setByteElement(term860, 0, (byte) -2);
        setByteElement(term860, 1, (byte) 103);
        setByteElement(term860, 2, (byte) 23);
        setByteElement(term860, 3, (byte) 96);
        setByteElement(term860, 4, (byte) -70);
        setByteElement(term860, 5, (byte) -73);
        setByteElement(term860, 6, (byte) 1);
        setByteElement(term860, 7, (byte) 99);
        setField(term839, term839.getClass(), "assemBuf", term860);
        setField(term869, term869.getClass(), "inStream", null);
        setField(term869, term869.getClass(), "outStream", null);
        setIntField(term869, term869.getClass(), "blockSize", 1532716628);
        setIntField(term869, term869.getClass(), "recordSize", -1801760683);
        setIntField(term869, term869.getClass(), "recsPerBlock", 1141317871);
        setByteElement(term873, 0, (byte) -121);
        setByteElement(term873, 1, (byte) -50);
        setByteElement(term873, 2, (byte) -79);
        setByteElement(term873, 3, (byte) 110);
        setByteElement(term873, 4, (byte) -111);
        setByteElement(term873, 5, (byte) -54);
        setField(term869, term869.getClass(), "blockBuffer", term873);
        setIntField(term869, term869.getClass(), "currBlkIdx", 890669485);
        setIntField(term869, term869.getClass(), "currRecIdx", 691577392);
        setField(term839, term839.getClass(), "buffer", term869);
        setIntField(term839, term839.getClass(), "longFileMode", -893623680);
        setIntField(term839, term839.getClass(), "bigNumberMode", -1963434938);
        setBooleanField(term839, term839.getClass(), "closed", false);
        setBooleanField(term839, term839.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term839, term839.getClass(), "finished", true);
        setField(term839, term839.getClass(), "out", null);
        setField(term839, term839.getClass(), "encoding", null);
        setBooleanField(term839, term839.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term888, 0, (byte) -25);
        setByteElement(term888, 1, (byte) -35);
        setField(term839, term839.getClass(), "oneByte", term888);
        setLongField(term839, term839.getClass(), "bytesWritten", 5262507301787091109L);
        term892 = (byte[]) newByteArray(8);
        setByteElement(term892, 0, (byte) 3);
        setByteElement(term892, 1, (byte) -10);
        setByteElement(term892, 2, (byte) -106);
        setByteElement(term892, 3, (byte) -124);
        setByteElement(term892, 4, (byte) -71);
        setByteElement(term892, 5, (byte) 113);
        setByteElement(term892, 6, (byte) -77);
        setByteElement(term892, 7, (byte) -12);
        term901 = new Integer(906181092);
        term903 = new Integer(1045657203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term892;
        args[1] = term901;
        args[2] = term903;
        try {
            callMethod(klass, "write", argTypes, term839, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


