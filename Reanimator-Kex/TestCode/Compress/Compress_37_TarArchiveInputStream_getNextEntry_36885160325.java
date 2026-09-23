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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class TarArchiveInputStream_getNextEntry_36885160325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5543;

    public TarArchiveInputStream_getNextEntry_36885160325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5666 = Class.forName((String) "java.io.File$PathStatus");
        Field term5665 = ((Class) term5666).getDeclaredField((String) "INVALID");
        ((Field) term5665).setAccessible(true);
        Object enum19 = ((Field) term5665).get((Object) null);
        HashMap term5624 = new HashMap();
        term5543 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term5544 = (byte[]) newByteArray(6);
        Object term5556 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5595 = newInstance(Class.forName("java.io.File"));
        byte[] term5634 = (byte[]) newByteArray(1);
        setByteElement(term5544, 0, (byte) 58);
        setByteElement(term5544, 1, (byte) 12);
        setByteElement(term5544, 2, (byte) 79);
        setByteElement(term5544, 3, (byte) -4);
        setByteElement(term5544, 4, (byte) -27);
        setByteElement(term5544, 5, (byte) 120);
        setField(term5543, term5543.getClass(), "SMALL_BUF", term5544);
        setIntField(term5543, term5543.getClass(), "recordSize", 1072005683);
        setIntField(term5543, term5543.getClass(), "blockSize", 1861318859);
        setBooleanField(term5543, term5543.getClass(), "hasHitEOF", false);
        setLongField(term5543, term5543.getClass(), "entrySize", 3452833434644634217L);
        setLongField(term5543, term5543.getClass(), "entryOffset", -8603648071751666348L);
        setField(term5543, term5543.getClass(), "is", null);
        setField(term5556, term5556.getClass(), "name", "");
        setBooleanField(term5556, term5556.getClass(), "preserveLeadingSlashes", false);
        setIntField(term5556, term5556.getClass(), "mode", 1474524152);
        setLongField(term5556, term5556.getClass(), "userId", -7884871963229073324L);
        setLongField(term5556, term5556.getClass(), "groupId", -8649738738252714180L);
        setLongField(term5556, term5556.getClass(), "size", -7278883608542636188L);
        setLongField(term5556, term5556.getClass(), "modTime", -1539859611880912454L);
        setBooleanField(term5556, term5556.getClass(), "checkSumOK", true);
        setByteField(term5556, term5556.getClass(), "linkFlag", (byte) -25);
        setField(term5556, term5556.getClass(), "linkName", "");
        setField(term5556, term5556.getClass(), "magic", "ustar ");
        setField(term5556, term5556.getClass(), "version", "00");
        setField(term5556, term5556.getClass(), "userName", "root");
        setField(term5556, term5556.getClass(), "groupName", "");
        setIntField(term5556, term5556.getClass(), "devMajor", 568954359);
        setIntField(term5556, term5556.getClass(), "devMinor", 53410913);
        setBooleanField(term5556, term5556.getClass(), "isExtended", true);
        setLongField(term5556, term5556.getClass(), "realSize", 4100236067313034103L);
        setBooleanField(term5556, term5556.getClass(), "paxGNUSparse", false);
        setBooleanField(term5556, term5556.getClass(), "starSparse", false);
        setField(term5595, term5595.getClass(), "path", "xOcJIiQQDu");
        setField(term5595, term5595.getClass(), "status", enum19);
        setIntField(term5595, term5595.getClass(), "prefixLength", -375014958);
        setField(term5595, term5595.getClass(), "filePath", null);
        setField(term5556, term5556.getClass(), "file", term5595);
        setField(term5543, term5543.getClass(), "currEntry", term5556);
        setField(term5543, term5543.getClass(), "zipEncoding", null);
        setField(term5543, term5543.getClass(), "encoding", "GVizqqzXpy");
        setField(term5543, term5543.getClass(), "globalPaxHeaders", term5624);
        setByteElement(term5634, 0, (byte) 114);
        setField(term5543, term5543.getClass(), "SINGLE", term5634);
        setLongField(term5543, term5543.getClass(), "bytesRead", 1195529027276497124L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextEntry", argTypes, term5543, args);
    }

};


