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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_70184422357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4985;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_70184422357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20867 = Class.forName((String) "java.io.File$PathStatus");
        Field term20866 = ((Class) term20867).getDeclaredField((String) "INVALID");
        ((Field) term20866).setAccessible(true);
        Object enum53 = ((Field) term20866).get((Object) null);
        term4985 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4986 = (byte[]) newByteArray(7);
        Object term4999 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5035 = newInstance(Class.forName("java.io.File"));
        byte[] term5064 = (byte[]) newByteArray(2);
        setByteElement(term4986, 0, (byte) -73);
        setByteElement(term4986, 1, (byte) 1);
        setByteElement(term4986, 2, (byte) 99);
        setByteElement(term4986, 3, (byte) -121);
        setByteElement(term4986, 4, (byte) -50);
        setByteElement(term4986, 5, (byte) -79);
        setByteElement(term4986, 6, (byte) 110);
        setField(term4985, term4985.getClass(), "SMALL_BUF", term4986);
        setIntField(term4985, term4985.getClass(), "recordSize", 691577392);
        setIntField(term4985, term4985.getClass(), "blockSize", -893623680);
        setBooleanField(term4985, term4985.getClass(), "hasHitEOF", true);
        setLongField(term4985, term4985.getClass(), "entrySize", -6301101997917060727L);
        setLongField(term4985, term4985.getClass(), "entryOffset", 8166095254618543564L);
        setField(term4985, term4985.getClass(), "is", null);
        setField(term4999, term4999.getClass(), "name", "");
        setIntField(term4999, term4999.getClass(), "mode", -1963434938);
        setLongField(term4999, term4999.getClass(), "userId", -4598158870068953328L);
        setLongField(term4999, term4999.getClass(), "groupId", 138235087558060686L);
        setLongField(term4999, term4999.getClass(), "size", 5381386339318883012L);
        setLongField(term4999, term4999.getClass(), "modTime", -1333707622307134180L);
        setBooleanField(term4999, term4999.getClass(), "checkSumOK", false);
        setByteField(term4999, term4999.getClass(), "linkFlag", (byte) -111);
        setField(term4999, term4999.getClass(), "linkName", "");
        setField(term4999, term4999.getClass(), "magic", "ustar ");
        setField(term4999, term4999.getClass(), "version", "00");
        setField(term4999, term4999.getClass(), "userName", "root");
        setField(term4999, term4999.getClass(), "groupName", "");
        setIntField(term4999, term4999.getClass(), "devMajor", 906181092);
        setIntField(term4999, term4999.getClass(), "devMinor", 1045657203);
        setBooleanField(term4999, term4999.getClass(), "isExtended", false);
        setLongField(term4999, term4999.getClass(), "realSize", -4360569253593381888L);
        setField(term5035, term5035.getClass(), "path", "jDtqGUpnZN");
        setField(term5035, term5035.getClass(), "status", enum53);
        setIntField(term5035, term5035.getClass(), "prefixLength", 1386130016);
        setField(term5035, term5035.getClass(), "filePath", null);
        setField(term4999, term4999.getClass(), "file", term5035);
        setField(term4985, term4985.getClass(), "currEntry", term4999);
        setField(term4985, term4985.getClass(), "zipEncoding", null);
        setField(term4985, term4985.getClass(), "encoding", "nGKItKLYNC");
        setByteElement(term5064, 0, (byte) -54);
        setByteElement(term5064, 1, (byte) -25);
        setField(term4985, term4985.getClass(), "SINGLE", term5064);
        setLongField(term4985, term4985.getClass(), "bytesRead", 1457594663983990440L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term4985, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


