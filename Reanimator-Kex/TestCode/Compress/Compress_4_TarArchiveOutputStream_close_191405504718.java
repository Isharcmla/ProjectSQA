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

public class TarArchiveOutputStream_close_191405504718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149;
     Object term75986;

    public TarArchiveOutputStream_close_191405504718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term164 = (byte[]) newByteArray(7);
        byte[] term173 = (byte[]) newByteArray(1);
        Object term175 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term176 = (byte[]) newByteArray(6);
        byte[] term191 = (byte[]) newByteArray(5);
        setLongField(term149, term149.getClass(), "currSize", 5270370404989704783L);
        setField(term149, term149.getClass(), "currName", "MuLcgQHgqz");
        setLongField(term149, term149.getClass(), "currBytes", 7411271909051562686L);
        setByteElement(term164, 0, (byte) 98);
        setByteElement(term164, 1, (byte) 67);
        setByteElement(term164, 2, (byte) 66);
        setByteElement(term164, 3, (byte) -121);
        setByteElement(term164, 4, (byte) -119);
        setByteElement(term164, 5, (byte) 71);
        setByteElement(term164, 6, (byte) 80);
        setField(term149, term149.getClass(), "recordBuf", term164);
        setIntField(term149, term149.getClass(), "assemLen", -6029667);
        setByteElement(term173, 0, (byte) 42);
        setField(term149, term149.getClass(), "assemBuf", term173);
        setField(term175, term175.getClass(), "inStream", null);
        setField(term175, term175.getClass(), "outStream", null);
        setByteElement(term176, 0, (byte) 72);
        setByteElement(term176, 1, (byte) 111);
        setByteElement(term176, 2, (byte) 99);
        setByteElement(term176, 3, (byte) -12);
        setByteElement(term176, 4, (byte) -61);
        setByteElement(term176, 5, (byte) -85);
        setField(term175, term175.getClass(), "blockBuffer", term176);
        setIntField(term175, term175.getClass(), "currBlkIdx", -2068769794);
        setIntField(term175, term175.getClass(), "currRecIdx", -117576464);
        setIntField(term175, term175.getClass(), "blockSize", -1007160944);
        setIntField(term175, term175.getClass(), "recordSize", 1135664017);
        setIntField(term175, term175.getClass(), "recsPerBlock", 590364439);
        setField(term149, term149.getClass(), "buffer", term175);
        setIntField(term149, term149.getClass(), "longFileMode", 865208305);
        setBooleanField(term149, term149.getClass(), "closed", true);
        setBooleanField(term149, term149.getClass(), "haveUnclosedEntry", true);
        setField(term149, term149.getClass(), "out", null);
        setByteElement(term191, 0, (byte) -22);
        setByteElement(term191, 1, (byte) 93);
        setByteElement(term191, 2, (byte) 69);
        setByteElement(term191, 3, (byte) -74);
        setByteElement(term191, 4, (byte) -123);
        setField(term149, term149.getClass(), "oneByte", term191);
        term75986 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term75989 = (byte[]) newByteArray(7);
        byte[] term75990 = (byte[]) newByteArray(1);
        Object term75991 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term75992 = (byte[]) newByteArray(6);
        byte[] term75993 = (byte[]) newByteArray(5);
        setLongField(term75986, term75986.getClass(), "currSize", 5270370404989704783L);
        setField(term75986, term75986.getClass(), "currName", "MuLcgQHgqz");
        setLongField(term75986, term75986.getClass(), "currBytes", 7411271909051562686L);
        setByteElement(term75989, 0, (byte) 98);
        setByteElement(term75989, 1, (byte) 67);
        setByteElement(term75989, 2, (byte) 66);
        setByteElement(term75989, 3, (byte) -121);
        setByteElement(term75989, 4, (byte) -119);
        setByteElement(term75989, 5, (byte) 71);
        setByteElement(term75989, 6, (byte) 80);
        setField(term75986, term75986.getClass(), "recordBuf", term75989);
        setIntField(term75986, term75986.getClass(), "assemLen", -6029667);
        setByteElement(term75990, 0, (byte) 42);
        setField(term75986, term75986.getClass(), "assemBuf", term75990);
        setField(term75991, term75991.getClass(), "inStream", null);
        setField(term75991, term75991.getClass(), "outStream", null);
        setByteElement(term75992, 0, (byte) 72);
        setByteElement(term75992, 1, (byte) 111);
        setByteElement(term75992, 2, (byte) 99);
        setByteElement(term75992, 3, (byte) -12);
        setByteElement(term75992, 4, (byte) -61);
        setByteElement(term75992, 5, (byte) -85);
        setField(term75991, term75991.getClass(), "blockBuffer", term75992);
        setIntField(term75991, term75991.getClass(), "currBlkIdx", -2068769794);
        setIntField(term75991, term75991.getClass(), "currRecIdx", -117576464);
        setIntField(term75991, term75991.getClass(), "blockSize", -1007160944);
        setIntField(term75991, term75991.getClass(), "recordSize", 1135664017);
        setIntField(term75991, term75991.getClass(), "recsPerBlock", 590364439);
        setField(term75986, term75986.getClass(), "buffer", term75991);
        setIntField(term75986, term75986.getClass(), "longFileMode", 865208305);
        setBooleanField(term75986, term75986.getClass(), "closed", true);
        setBooleanField(term75986, term75986.getClass(), "haveUnclosedEntry", true);
        setField(term75986, term75986.getClass(), "out", null);
        setByteElement(term75993, 0, (byte) -22);
        setByteElement(term75993, 1, (byte) 93);
        setByteElement(term75993, 2, (byte) 69);
        setByteElement(term75993, 3, (byte) -74);
        setByteElement(term75993, 4, (byte) -123);
        setField(term75986, term75986.getClass(), "oneByte", term75993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term149, args);
        assertTrue(recursiveEquals(term149, term75986));
    }

};


